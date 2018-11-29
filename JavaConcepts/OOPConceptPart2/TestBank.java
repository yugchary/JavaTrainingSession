package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		// USBank.min_bal = 200; 
		
		//USBank us = new USBank();  cannot be instantiated
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		System.out.println("min bal "+hs.min_bal + " "+ USBank.min_bal);
		
		System.out.println("****");
		
		//dynamic Polymorphism: 
		//child class object can be referred by parent Interface reference variable
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		
		
		
		
		
		/* cannot access child methods
		us.educationLoan();
		us.carloan();
		us.mutualFund();
		*/
	
	}

}
