package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank {	//we are achieving Multiple Inheritance
	//Is-a relationship
	
	//if a class is implementing Interface, it is mandatory to define/Override all the methods of Interface
	
	//Overriding from USBank
	public void credit() {
		System.out.println("HSBC Credit");
	}
	
	public void debit() {
		System.out.println("HSBC debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC transfer money");
	}
	
	//seperate methods for HSBC Bank class
	public void educationLoan() {
		System.out.println("HSBC Education Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}
	
	//Overriding from BrazilBank
	public void mutualFund() {
		System.out.println("Brazil bank Mutual Fund");
		
	}

}
