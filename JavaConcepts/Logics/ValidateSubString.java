package Logics;

public class ValidateSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str = "ABCDEFGH"; String substr = "ABCDEFGH";
		 * 
		 * int a[] = new int[str.length()];
		 * 
		 * for(int i=0;i<substr.length();i++) a[i]= str.indexOf(substr.charAt(i));
		 * 
		 * for(int k=0;k<a.length;k++) System.out.println(a[k]); boolean flag=false;
		 * 
		 * for(int j=0;j<substr.length()-1;j++) { if(a[j]<a[j+1]) flag = true; else
		 * flag=false; }
		 * 
		 * System.out.println(flag);
		 */

		String s1 = new String("anurrag");
		String s2 = new String("arr");

		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		int i = 0;
		int j = 0;

		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				i++;
				j++;
			} else {
				i++;
				j = 0;
			}
			if (j == b.length) {
				System.out.println("we have found the substring");
			}
			
		}
	}

}
