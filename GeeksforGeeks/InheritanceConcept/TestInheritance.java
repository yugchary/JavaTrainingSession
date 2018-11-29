package InheritanceConcept;

public class TestInheritance {
	
	// http://www.bullraider.com/quiz/core-java-quiz/java-overrding-part-1

	public static void main(String[] args) {
		 
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
		
		
		
		Bicycle bc = new Bicycle(3, 100);
		System.out.println(bc.toString());
		Bicycle.luggage();
		
		
	}

}
