package OOPConceptPart1;

public class FunctionsInJava {
	
	//main method --> starting point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first object will be created, obj is the reference variable, referring to this object
		//after creating the object, the copy of all non static methods will be given to this object
		//main method does not return any value
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		
		String x;
		x = obj.qa();
		System.out.println(x);
				
		//return "x"; main method is void -never returns a value
		
	}
	
	//non static methods
	
	
	//void - deoes not return any value
	//return type - void
	public void test() {
		System.out.println("test method");
	}
	
	
	//return type String
	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}

}
