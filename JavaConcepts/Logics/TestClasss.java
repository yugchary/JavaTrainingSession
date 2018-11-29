package Logics;





public class TestClasss {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot r1 = new Robot("Tom", "Red", 20);
		
		Robot r2 = new Robot("Jerry", "Green", 30);
		
		Robot r3 = new Robot();
		r3.name = "merry";
		
		r1.introduceSelf();
		r3.introduceSelf();
		r3.sleep("bed");

	}

}
