package StringlClasses;

public class StringProcess {
	public static void main(String[] args) {
		String s1= "Wiley";
		String s2= "Wiley";
		String s3= new String ("Wiley");
		String s4= new String ("Wiley");
		//System.out.println(s1==s2);
	//	System.out.println(s3==s2);
		String str = "I am java developer";
		String str1 = "I am Python developer";
	String str3	= str1.concat(str1);
	System.out.println(str1.length());
	System.out.println(str1.charAt(10));
	System.out.println(str1);
	System.out.println(str.replace('D', 'd'));
	String st[]= str.split("");
	for(String string: st) {
		System.out.println(string);
	}
	String UserInput = "  Mobile";
	System.out.println(UserInput.trim());
	System.out.println(UserInput);
	System.out.println(str.substring(0,4));
	System.out.println(str.toUpperCase());
		}
	

}
