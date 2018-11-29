package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;	//final in nature
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	//only method declaration
	//no method body - only method prototype
	//we can declare the variables, by default they are static in nature.
	//variable values are not changed, final in nature
	//no static methods in interface
	//no main method
	//we cannot create the object of interface, we cannot Instantiate
	//Interfaces are abstract in nature
	//complete abstraction (100%) pure virtual function
	
	

}
