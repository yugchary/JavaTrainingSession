package OOPConceptPart2;

public class BMW extends Car{	//"has-a relationship" > only and only you are using by calling dynamic polymorphism
								//Over-ridden method will be called and parent class method will be called
	
	//when method is present in parent class as well as in child class with same name and same number of arguments, 
	// it is called Method-Overriding 
	
	/*Overloading is compile time polymorphism where more than one methods share the same name with different parameters or signature and different return type.
	Overriding is run time polymorphism having same method with same parameters or signature, but associated in a class & its subclass*/
	
	public void start() {	//Overridden method
		
		System.out.println("BMW > Automatic Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW > Theft Safety Method");
	}

}
 