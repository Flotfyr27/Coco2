import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

class faux{ // collection of non-OO auxiliary functions (currently just error)
    public static void error(String msg){
	System.err.println("Interpreter error: "+msg);
	System.exit(-1);
    }
}

abstract class AST{
}

class Start extends AST{

	String s = "";
	String indent = "	";
    public List<DataTypeDef> datatypedefs;
    Start(List<DataTypeDef> datatypedefs){
	this.datatypedefs=datatypedefs;
    }
    public String translate(){
	s+= "import java.util.*;\nabstract class AST{}\n\n";
    for(DataTypeDef d: datatypedefs){
        s+= "abstract class ";
        s+= d.dataTypeName;
        s+= " extends AST {\n";
        s+= indent + "public abstract ";
        s+= d.functionHead +" ;";
        s+= "\n};\n\n";
        for(Alternative a: d.alternatives){
            s+= "class ";
            s+= a.constructor + " extends "+ d.dataTypeName+"{\n" + indent;
            for(Argument arg: a.arguments){
                s+= arg.type+ " "+arg.name+";\n"+indent;
            }
            s+= a.constructor+"(";
            for(Argument arg: a.arguments){
                if(!(arg.equals(a.arguments.get(a.arguments.size()-1)))){
                    s+= arg.type +" "+ arg.name+", " ;
                } else {
                    s+= arg.type +" "+ arg.name+")";
                }
            }
            s+= "{";
            for(Argument arg: a.arguments){
                s+= "this." + arg.name + "=" + arg.name +"; ";
            }
            s+= "}\n" + indent;
            s+= "public "+ d.functionHead+ a.code +"\n";
            s+= "}\n\n";
        }
	}
	return s;
    }
}

class DataTypeDef extends AST{
    public String dataTypeName;
    public String functionHead;
    public List<Alternative> alternatives;
    DataTypeDef(String dataTypeName, String functionHead, List<Alternative> alternatives){
	this.dataTypeName=dataTypeName;
	this.functionHead=functionHead;
	this.alternatives=alternatives;
    }
}

class Alternative extends AST{
    public String constructor;
    public List<Argument> arguments;
    public String code;
    Alternative(String constructor, List<Argument> arguments,  String code){
	this.constructor=constructor;
	this.arguments=arguments;
	this.code=code;
    }
}

class Argument extends AST{
    public String type;
    public String name;
    Argument(String type, String name){this.type=type; this.name=name;}
}