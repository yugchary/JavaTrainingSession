package InterfaceConcept;

public class TestInterface {

	public static void main(String[] args) {
		
		 // creating the Object of Rectangle class
        // and using shape interface reference.
        Shape rect = new Rectangle(2,3);
        System.out.println("Area of rectangle: " + rect.area());
        rect.display();
        Shape.display1();
 
        // creating the Objects of circle class
        Shape circle = new Circle(2);
        System.out.println("Area of circle: " + circle.area());

	}

}
