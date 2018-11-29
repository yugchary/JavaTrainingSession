package OOPConceptPart1;

public class StaticAndNonStatic {
	
	
	//global vars - the scope of global variable is available across all the functions with some conditions
	String name = "Selenium";	//non static global variable
	static int age = 25;	// static global variable
	
	
	
	//static variables and methods are created in java memory separately, they are not part of the object 
	

	public static void main(String[] args) {
		
		//how to call static methods
		//1. direct calling;
		sum();
		//2. calling my class name
		StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		
		
		
		//how to call non-static methods
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can I access static method by using object reference? 
		//Ans: Yes, not a best practice
		
		obj.sum();
		

	}
	
	public void sendMail(){	//non static method
		System.out.println("send mail method");
	}

	public static void sum() { //static method
		System.out.println("static sum method");
	}
}
