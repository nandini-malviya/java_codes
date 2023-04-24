package demo_protected;
import Wiley_core_java.AcessModifiers;
public class AccessModifiers {
public static void main(String[] args) {
	AcessModifiers person = new AcessModifiers("Nandani",21, "Indore",12456790);
System.out.println(person.phoneNumber); 
person.setAge(21); 
person.setAddress("Indore"); 
person.setPhoneNumber(12456790); 
Employees employee = new Employees("Nandini", 20, "MP", 124560);
employee.displayDetails(); 
}
}