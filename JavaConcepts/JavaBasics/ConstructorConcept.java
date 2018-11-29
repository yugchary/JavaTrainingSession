package JavaBasics;

public class ConstructorConcept {

	// Constructor can be overloaded

	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("Single param constructore");
		System.out.println("the value of i " + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("Two param constructor");
		System.out.println("the value of i " + i);
		System.out.println("the value of j " + j);

	}

	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(1);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);

	}

}
