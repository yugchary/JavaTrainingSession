package StaticBindingConcept;

public class TestStaticBinding {

	/*
	 * An object in Java that passes more than one IS-A tests is polymorphic in nature 
	 * Every object in Java passes a minimum of two IS-A tests: one for itself and one for Object class 
	 * Static polymorphism in Java is achieved by method overloading 
	 * Dynamic polymorphism in Java is achieved by method overriding
	 */

	public static void main(String[] args) {

		SuperClass A = new SuperClass();
		SuperClass B = new SubClass();
		A.print();
		B.print();
		SuperClass.print();
		SubClass.print();

	}

}
