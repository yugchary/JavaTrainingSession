package AbstractionConcept;

public abstract class Bank {
	
	int amt = 100;
	final int rate =10;
	static int loan = 5;
	
	public abstract void loan();	//abstract method -- no method body
	
	//partial abstraction -- we have other credit and debit methods
	//hiding the implementation logic -- is called Abstraction -- OOPS concept	
	//Abstract class can have abs mehtods and non-abs methods
	//cannot be instantiated
	
	
	//non-abstract methods
	public void credit() {
		System.out.println("Bank Credit");
	}
	
	public void debit() {
		System.out.println("Bank Debit");
	}
	
	public void creditcard() {
		System.out.println("Bank > Credit card");
	}

	

}
