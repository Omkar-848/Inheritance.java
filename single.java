package Inheritance;

public class single { // Parent class

    public void sham() {
        System.out.println("Sham has good communication");
    }
}

class single2 extends single { // Child class

    public void ram() {
        System.out.println("Ram is good");
    }

    public static void main(String[] args) {
        single2 S = new single2(); // Create object of child class
        S.sham(); // Call parent class method
        S.ram();  // Call child class method
    }
}

	
	
	


