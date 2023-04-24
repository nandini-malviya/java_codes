package Wiley_core_java;
class book {
	  public void learn() {
	    System.out.println("Learning Faculty...");
	  }
	}

	class Students extends book {
	  public void learn() {
	    System.out.println("Learning Student...");
	  }
	}
	class Children extends book {

	  public void learn() {
	    System.out.println("learning Children...");
	  }
	}
	public class Polymorphism {
	  public static void main(String[] args) {
	    Students s1 = new Students();
	    s1.learn();
	    Children c1 = new Children();
	    c1.learn();
	  }
	}
