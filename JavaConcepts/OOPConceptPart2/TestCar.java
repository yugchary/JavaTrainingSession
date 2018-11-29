package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism or also called as compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		System.out.println("Car wheels: "+b.wheels + " " + Vehicle.wheels);
		Vehicle.wheels = 3;
		
		System.out.println("Car wheels: "+b.wheels + " " + Vehicle.wheels);
		
		System.out.println("*******");
		
		Car c = new Car();
		c.start();
		c.refuel();
		
			
		
		System.out.println("*******");
		
		//Top-Casting
		Car c1 = new BMW();	//child class object can be referred by the parent class reference variable 
							//this is called Dynamic Polymorphism or Run time Polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down-Casting
		//BMW b1 = (BMW)new Car();	//ClassCastException --> it does not allow at runtime, It allows at compile time
									
		//There are two stages of execution, one is compile and other is runtime
		//At compile time it would see, we are converting or casting it
		//But at run time it will give you ClassCastException. 
		//It means Car cannot be  cast to BMW. You are degrading the cast of Car class(parent class) into child class object
		//And then referred by a child class reference variable.
		
		
		System.out.println("*******");
		
		Vehicle v = new Vehicle();
		v.engine();
		
		//Can we have runtime polymorphism by using static methods?
		//Run time polymorphism is about calling the right version of the virtual function depending on the type of object pointed to, by a pointer to base class. 
		//Either derived or base class version will be called depending on the object which will be decided at run time.

		//Now since you don't need object to call static functions, instead you have to call it by class name::functionName
		//So you already know at compile time itself which function to call. You don't need dynamic binding or run time polymorphism.
		
	} 

}
