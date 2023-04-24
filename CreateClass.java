package Wiley_core_java;

public class CreateClass implements Cloneable  {
 
int a=10;
public void add() {
	System.out.println("Number adding");	
}
public static void main(String args[]) throws InstantiationException, IllegalAccessException, CloneNotSupportedException	{
	CreateClass cc= new CreateClass();
	//new keyword
	cc.add();
	System.out.println(cc);
	//Create object with newInstance()
	Class c = null;
	try {
		c = Class.forName("Wiley_core_java.CreateClass"); // qualified class name - package.class
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	CreateClass ci= (CreateClass) c.newInstance();
    ci.add();
    System.out.println(ci);
     CreateClass objClone= (CreateClass) cc.clone();
     objClone.add();
     System.out.println( "object clone: -" + objClone);
    
 }
}
