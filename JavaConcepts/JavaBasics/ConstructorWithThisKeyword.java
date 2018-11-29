package JavaBasics;

public class ConstructorWithThisKeyword {
	
	//class vars
	String name;
	int age;
	
	//this keyword is used to initialize the global/class variable with current values of constructor
	//Constructors are pointing to the current state of the object
	
	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name;		//this dot global variable = local variable
		this.age = age;
		// name1 = name; 		//name1 is the global variable, using this is NOT required
		System.out.println("name "+name);
		System.out.println("age "+age);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);

	}

}
	