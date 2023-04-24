package Wiley_core_java;
class Employee {
  private String name;
  private int age;
  private double salary;
  // Getter methods
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public double getSalary() {
    return salary;
  }
  // Setter methods
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
}
public class EmployeeEncapsulation {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setName("Nandini");
    employee.setAge(21);
    employee.setSalary(75000.00);
    // Accessing the employee object's private variables using getter methods
    System.out.println("Name: " + employee.getName());
    System.out.println("Age: " + employee.getAge());
    System.out.println("Salary: " + employee.getSalary());
  }
}
