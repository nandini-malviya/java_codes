package Wiley_core_java;
//Parent class
class Animals {
public void eat() {
 System.out.println("Eating...");
}
}
//Child class 1
class Dog extends Animals {
public void bark() {
 System.out.println("Barking...");
}
}
//Child class 2
class Cat extends Animals {
public void meow() {
 System.out.println("Meowing...");
}
}
//Grandchild class
class Bulldog extends Dog {
public void breed() {
 System.out.println("Bulldog breed...");
}
}
public class HybridInheritance {
public static void main(String[] args) {
 Bulldog bulldog = new Bulldog();
 bulldog.eat(); // Inherited from Animal class
 bulldog.bark(); // Inherited from Dog class
 bulldog.breed(); // Inherited from Bulldog class
 Cat cat = new Cat();
 cat.eat(); // Inherited from Animal class
 cat.meow(); // Inherited from Cat class
}
}