package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//Global vars - class variable
	String name = "Selenium";
	int x = 100;
	
	public static void main(String[] args) {
		int i = 10; // local vars
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.x);

	}
	
	public void sum() {
		int i;   // local vars
		int j;
	}

}
