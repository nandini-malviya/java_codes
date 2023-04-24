package Wiley_core_java;
interface Person {
public String getName();
}
interface Teacher extends Person {
public int getSalary();
}
interface Student extends Person {
public int getRollNo();
}
public class DiamondProblem implements Teacher, Student {
private String name;
private int rollNo;
private int salary;
public DiamondProblem(String name, int rollNo, int salary) {
 this.name = name;
 this.rollNo = rollNo;
 this.salary = salary;
}
public String getName() {
 return name;
}
public int getRollNo() {
 return rollNo;
}
public int getSalary() {
 return salary;
}
public static void main(String[] args) {
 DiamondProblem Dp = new DiamondProblem("Nandini", 81, 75000);
 System.out.println("Name: " + Dp.getName()); // Inherited from Person interface
 System.out.println("Roll No: " + Dp.getRollNo()); // Inherited from Student interface
 System.out.println("Salary: " + Dp.getSalary()); // Inherited from Teacher interface
}
}