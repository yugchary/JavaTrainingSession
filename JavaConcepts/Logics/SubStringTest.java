package Logics;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		
		char initial = str.charAt(0); // first character
	    String rem = str.substring(1); // Full string without first character
		
		//System.out.println(str.substring(0));
		char c ='A';
		
		for (int i = 0;i<=str.length();i++){
			//System.out.println(charInsert(str, c, i));
			System.out.println(i+"value(i)"+str.substring(i));
			System.out.println(i+"value(0,i)"+str.substring(0,i));
        }
		
		

	}
	
	public static String charInsert(String str, char c, int j) {
	    String begin = str.substring(0, j);
	    System.out.println(begin);
	    String end = str.substring(j);
	    System.out.println(end);
	    return begin + c + end;
	}

}
