package ExceptionHandling;

import java.util.InputMismatchException;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		
		int c = 10/2;
		System.out.println(c);
		
		
	    System.out.println("start of program");
		
		try {
		int c1 = 10/0;
		System.out.println(c1);
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("End of program");
		}
		

	}

}
