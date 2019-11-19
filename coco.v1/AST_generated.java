import java.util.*;
abstract class AST{}

abstract class expr extends AST {
	public abstract  String translate()  ;
};

class Start extends expr{
	String s;
	String indent;
	List<DataTypeDef> datatypedefs;
	Start(String s, String indent, List<DataTypeDef> datatypedefs){this.s=s; this.indent=indent; this.datatypedefs=datatypedefs; }
	public  String translate() { s+= "import java.util.*;\nabstract class AST{}\n\n";
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
	return s;  }
}

class DataTypeDef extends expr{
	String dataTypeName;
	String functionHead;
	List<Alternative> alternatives;
	DataTypeDef(String dataTypeName, String functionHead, List<Alternative> alternatives){this.dataTypeName=dataTypeName; this.functionHead=functionHead; this.alternatives=alternatives; }
	public  String translate() { return "";}
}

class Alternative extends expr{
	String constructor;
	List<Argument> arguments;
	String code;
	Alternative(String constructor, List<Argument> arguments, String code){this.constructor=constructor; this.arguments=arguments; this.code=code; }
	public  String translate() { return ""; }
}

class Argument extends expr{
	String type;
	String name;
	Argument(String type, String name){this.type=type; this.name=name; }
	public  String translate() { return ""; }
}


