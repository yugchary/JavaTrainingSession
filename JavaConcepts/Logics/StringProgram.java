package Logics;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x = "yug";
		int len = x.length();
		
		System.out.println("String lenght:" + len);
		
		//using charArray		
		char ch[] = x.toCharArray();
		for(int i=0;i<len;i++)
			System.out.println(ch[i]);
		
		
		//using charAt
		for(int i=0;i<len;i++)
			System.out.println(x.charAt(i));
		
		//reverse a string
		for(int j=len-1; j>=0; j-- )
			System.out.print(ch[j]);
		
		
		
		System.out.println();
		
		//char string
		char cha[] = {'a','b','c','3','e'};		
		
		
		for(int i=0;i<cha.length-1;i++) {
			if(Character.isDigit(cha[i]))
				System.out.println(cha[i]+"digit");
			else
				System.out.println(cha[i]+"char");
		}
			//System.out.print(cha[i]);
		
		char a = '0';
		
		System.out.println("ascii value of a:" + (int)a);
		
		//convert the char to String
		char y = x.charAt(1);
		String z = String.valueOf(x.charAt(1));
		
		System.out.println(y + z);

	}

}
