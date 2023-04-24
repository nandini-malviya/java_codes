package Wiley_core_java;
public class AcessModifiers {
private String name; // Can only be accessed within this class
int age; // Can be accessed within the package
protected String address; // Can be accessed within the package and subclasses
public int phoneNumber; // Can be accessed from anywhere
public AcessModifiers(String name, int age, String address, int phoneNumber) {
 this.name = name;
 this.age = age;
 this.address = address;
 this.phoneNumber = phoneNumber;
}
private void setName(String name) {
 this.name = name;
}
void setAge(int age) {
 this.age = age;
}
protected void setAddress(String address) {
 this.address = address;
}
public void setPhoneNumber(int phoneNumber) {
 this.phoneNumber = phoneNumber;
}
private String getName() {
 return name;
}
int getAge() {
 return age;
}
protected String getAddress() {
 return address;
}
public int getPhoneNumber() {
 return phoneNumber;
}
}
class Employees extends AcessModifiers {
public Employees(String name, int age, String address, int phoneNumber) {
 super(name, age, address, phoneNumber);
}

public void displayDetails() {
 System.out.println("Name: " + getName()); // Can access the protected method from the superclass
 System.out.println("Age: " + getAge()); // Can access the default method from the superclass
 System.out.println("Address: " + address); // Can access the protected variable from the superclass
 System.out.println("Phone Number: " + phoneNumber); // Can access the public variable from the superclass
}
}


