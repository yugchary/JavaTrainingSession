package OOPConceptPart1;

public class Car {
	
	//Class variables
	int model;
	String make;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// new Car() -- this is the object of Car class
		// a - is the reference variable of the object (object names) -- object reference variables
		// new keyword is used to create the object 
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2015;
		a.make = "BMW";
		
		b.model = 2016;
		b.make = "Ford";
		
		c.model = 2017;
		c.make = "Fiat";
		
		System.out.println("before refercing");
		
		System.out.println(a.model + a.make);
		System.out.println(b.model + b.make);
		System.out.println(c.model + c.make);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("after refercing");
		
		System.out.println(a.model + a.make);
		System.out.println(b.model + b.make);
		System.out.println(c.model + c.make);
		
		a.model = 2005;
		System.out.println(a.model);
		
		c.model = 2007;
		System.out.println(c.model);
		System.out.println(a.model); 
		System.out.println(b.model);
				
				

	}

}
