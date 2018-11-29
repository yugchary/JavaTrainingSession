package Logics;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char vow[] = {'a','e','i','o','u'};
		
		String str = "abacdeadfas afeei";
		
		System.out.println(vow);
		
		String vows = "aeiou";
		
		int vow_cout=0;
		
		for(int i=0;i<str.length();i++) {
			if (vows.contains(str.charAt(i)+"")) vow_cout++;
		}
				
		System.out.println("count of vowlers:" + vow_cout);

	}

}
