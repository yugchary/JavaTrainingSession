package Logics;

import java.util.regex.Pattern;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "44554509";
		
		char c[] = str.toCharArray();
		int k=0;
		for(int i=0;i<str.length();i++) {
			//System.out.println("ascii values: "+(int)c[i]);
			if(c[i]>=48&&c[i]<=57) {
				System.out.println(c[i]);
				k++;
			}
				
				
		}
		
		if(k==str.length()) System.out.println("all digits");
		
		 Pattern pattern = Pattern.compile(".*[^0-9].*");
		 String [] inputs = {"123", "-123" , "123.12", "abcd123"};
	      
	       for(String input: inputs){
	           System.out.println( "does " + input + " is number : "
	                                + !pattern.matcher(input).matches());
	       }

	}

}
