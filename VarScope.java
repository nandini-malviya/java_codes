package Wiley_core_java;

public class VarScope {
	int ins=20;
	int v1= 40;
	int val2= 40;
	static String name= "Nandini";
	
	public void sum() {
		int v1=10;
		int val2=20;
		System.out.println("sum methods" +( this.v1 + this.val2));
	}
	public static void main(String[] args) {
		int loc=56;
		VarScope vso= new  VarScope();
		System.out.println("the local Variable is :"+ loc );
		System.out.println("the instance Variable is :"+vso. ins );
		System.out.println("the Static Variable is :"+ name );
		vso.sum();
	}
	

}
