package AbstractionConcept;

public interface Car {
	
	//only static and final vars
	int wheels = 4;
	//only define only abstract methods (), 
	//no body method
	//only and only method declaration
	//only prototype or blueprint
	//we achieve 100% abstraction
	//cannot create the object of Interface
	
	public void start();
	public void stop();
	public void refuel();	
	

}
