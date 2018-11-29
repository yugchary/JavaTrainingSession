package DynamicBindingConcept;

public class TestDynamicBinding {

	public static void main(String[] args) {
		SuperClass A = new SuperClass();
		SuperClass B = new SubClass();
        A.print();
        B.print();

	}

}
