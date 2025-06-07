package Inheritance;

public class multilavel {
	
		void ShowA() {
			System.out.println("A is a class method");
		}
	}
	   class V extends multilavel{
		   void ShowV() {
			   System.out.println("v class method");
		   }
		   
	   }
	   class C extends V {
		   void ShowC() {
		   System.out.println("c class method");
	   }
	   public static void main(String[] args) {
		   multilavel ob1 = new multilavel();
			ob1.ShowA();
			
			System.out.println("----------------");
			
			V ob2 = new V();
			ob2.ShowA();
			ob2.ShowV();
			System.out.println("-----------------");
			C ob3 = new C();
			ob3.ShowA();
			ob3.ShowV();
			ob3.ShowC();
		}
	   }


