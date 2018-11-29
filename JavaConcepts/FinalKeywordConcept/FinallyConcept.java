package FinalKeywordConcept;

public class FinallyConcept {

	public static void main(String[] args) {
		
		test();
	}

	public static void test() {

		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test1");
		} catch (Exception e) {
			System.out.println("inside test1 cache block");
		}
		finally {		//finally block will always be executed irrespective of exception occurred in try catch block
			System.out.println("inside test1 finally block");
		}

	}
}