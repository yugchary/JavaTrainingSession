package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {


		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		//b.wheels = 6;
		
		System.out.println("*****");
		
		Car c = new BMW();
		
		c.start();
		c.start();
		c.refuel();
		
		
	}

}
