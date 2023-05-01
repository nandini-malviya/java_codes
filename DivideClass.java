package Patterns;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideClass {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter in words: ");
			String cardNum = sc.nextLine(); 
			
				Pattern pattern = Pattern.compile("^(\\d+) divide by (\\d+)$");
				Matcher matcher = pattern.matcher(cardNum);
				
				if(matcher.find()) {
					String simplifiedMsg = "Result= " + matcher.replaceFirst("$1/$2");
					System.out.println("Question is:  "+ simplifiedMsg);
					
					//int res = Integer.parseInt("$1")  / Integer.parseInt("$2");
					int res = Integer.valueOf(matcher.group(1))  / Integer.valueOf(matcher.group(2));
					
					System.out.println("Answer is: : "+ res);
				}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}