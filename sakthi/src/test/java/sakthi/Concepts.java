package sakthi;

public class Concepts {
	//instance varaiable
	int a,b=10;
	
		Concepts()
		{
			System.out.println("default constructor");
		}
		
		void Method1() {
			//local variable
			int a=0,b=10;
			System.out.println("default Method1="+a+","+b);
		}
		public static void main(String[] args) {
			
			System.out.println("main method");
			//Concepts constructor =new Concepts();  
			Concepts RefObj1 =new Concepts();  //reference obj
			RefObj1.Method1();
			System.out.println(RefObj1.a+","+RefObj1.b);
		}

	}




