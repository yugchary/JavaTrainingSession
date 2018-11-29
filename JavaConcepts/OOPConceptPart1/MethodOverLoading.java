package OOPConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		
		//we can overload main method
		//you cannot create a method inside another method
		//duplicate methods - ie, same method name with same number of arguments and data types are not  allowed
		
		//Method-Overloading - when the method name is same with different arguments with in the same class
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(20);
		obj.sum(3.0);
		obj.main();
		
				
		
		
	}
	
	public void main() {
		System.out.println("main duplicate metod");
	}
	
	public void sum() {	// 0 args
		System.out.println("with out params");
	}
	
	
	public void sum(int i) {
		
		System.out.println("with 1 parms" + i);
	}
	
	public void sum(double j) {
		System.out.println("with same 1 parms of differnt type - double");
	}

}
