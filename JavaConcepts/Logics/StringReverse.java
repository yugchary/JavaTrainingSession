package Logics;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd";
		
		
		System.out.println("substring: "+str);
		System.out.println("substring: "+str.substring(0,4));
		
		
	
		System.out.println("substring: "+str);
		System.out.println("substring: "+str.substring(2));
		
		int k =4;
		k++;
		System.out.println("i value: "+ k);
		k--;
		System.out.println("i value: "+ k);
		
		for(int i=str.length()-1; i>=0; i--)
			System.out.print(str.charAt(i));
		
		int i=0;
		for(char c: str.toCharArray()) {
			System.out.println(str.charAt(i));
			i++;
		}
			
		//StringBuffer str1 = "abcd";
		
		System.out.println("using Stringbuffer: "+ new StringBuffer(str).reverse().toString());
		
		reverseRecursively(str);
	}

	 public static String reverseRecursively(String str) {

	        //base case to handle one char string and empty string
	        if (str.length() < 2) {
	            return str;
	        }

	        return reverseRecursively(str.substring(1)) + str.charAt(0);

	    }

}
