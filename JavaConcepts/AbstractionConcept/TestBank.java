package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank h = new HDFCBank();
		h.credit();
		h.debit();
		h.loan();	//Over-ridden method
		h.funds();
		h.amt = 6;
		//h.rate = 9;
		h.loan = 8;
		h.creditcard();
		
		
		System.out.println("*******");
		Bank l = new HDFCBank();
		l.credit();
		l.debit();
		l.loan();
		l.creditcard();
		//l.funds();
		
		
		
		// Bank b = new Bank(); cannot instantiate the Abstract class
		
		
		

	}

}
