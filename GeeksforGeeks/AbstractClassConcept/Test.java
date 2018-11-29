package AbstractClassConcept;

public class Test {

	public static void main(String[] args) {

		Shape r = new Rectangle(2, 3, "Rectangle");
		r.draw();
		System.out.println("Area: " + r.area());
		r.moveTo(5, 9);
		
		System.out.println("*****");
		
		r = new Circle(3, "Circle");
		r.draw();
		System.out.println("Area: " + r.area());
		
		//So we can see that we are calling the same functions (area and draw, but based on the instance of the child class, 
		//each Shape object is acting differently.

		/*
		 * Shape rect = new Rectangle(2, 3, "Rectangle");
		 * System.out.println("Area of rectangle: " + rect.area()); rect.moveTo(1, 2);
		 */

	}

}
