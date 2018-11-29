package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+50);
		
		//String to int
		int y = Integer.parseInt(x);
		System.out.println(y+50);
		
		//wrapper classes -> Integer, Double, Boolean
		
		//String to double
		String z = "1.1";
		System.out.println(z +1.1);
		
	    System.out.println(Double.parseDouble(z)+1.1);
	    
	    //String to boolean
	    String p = "true";
	    boolean b = Boolean.parseBoolean(p);
	    System.out.println(b);
	    
	    //Int to String conversion
	    
	    int q = 200;
	    System.out.println(q+20);
	    
	    String s = String.valueOf(q);
	    System.out.println(s+20);
	    
	    String u = "100s";
	    Integer.parseInt(u);		//NumberFormatException: For input string: "100s"
	    

	}

}
