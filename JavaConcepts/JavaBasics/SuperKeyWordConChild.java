package JavaBasics;

public class SuperKeyWordConChild extends SuperKeyWordConcept {
	
	public SuperKeyWordConChild() {
		
		//explicitly call the parameterized constructor in super class  with the help of super keyword
		//super should be called as the first statement in the child construct, if at all super is used
		super(10);
		System.out.println("child class def constuctor");
	}
	
	public SuperKeyWordConChild(int i) {
		
		// explicitly call the parameterized constructor in super class  with the help of super keyword
		//super should be called as the first statement in the child construct, if at all super is used
		super();
		System.out.println("child class constuctor with single param "+i);
	}
	
	public static void main(String args[]) {
		
		SuperKeyWordConChild child = new SuperKeyWordConChild();
		SuperKeyWordConChild child1 = new SuperKeyWordConChild(10);
	}

}
