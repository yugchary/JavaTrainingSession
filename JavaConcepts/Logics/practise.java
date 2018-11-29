package Logics;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*for(int i=0; i<dup.length(); i++) 
			System.out.println("each character is "+dup.charAt(i));*/

			
		/*String splStr[] = dup.split(" ");
		
		for(String str:splStr)
			System.out.println("Splited strings are:"+ str);*/
		
		/*for(int i=dup.length()-1;i>=0;i--)
			System.out.println("printing reverse:"+dup.charAt(i));*/
		
		/*for(int j=i+1; j<dup.length(); j++)
		if(dupchar[i]==dupchar[j]) {
			System.out.println("duplicate char:"+ dupchar[i]);
			break;
			
			}*/
		
		
			
		/*for(int i=0;i<dup.length();i++)
			for(int j=i+1;j<dup.length();j++)
				if(dup.charAt(i)==dup.charAt(j))
					if(!dups.contains(String.valueOf(dup.charAt(j))))
						dups+=dup.charAt(j);
		
		
		System.out.println("duplicate count:"+dups.length()+dups);*/
						
		String dup = "aacgcaa afda asdf asdsff";
		
		System.out.println("String count:" + dup.length());	
		String dups= "";
		char dupchar[] = dup.toCharArray();	
		/*
		do {
			dupchar = dup.toCharArray();
			int count=0;
			for(int i=0; i<dup.length(); i++)
				if(dupchar[0]==dupchar[i])
					count++;
			
			if (count>1)
			System.out.println("count of char "+dupchar[0] + " is "+count);
		
			dup = dup.replace(""+dupchar[0], "");
			
			
		}while(dup.length()>=1);*/
			
		String s1 = new String("&amp;quot;abcd&amp;quot;");
		String s3 = new String(s1);
		
		//System.out.println(s3);
		
		String s4 = "yug";
		String s5 = s4;
		s4 = "test";
		
		char c1[] = s4.toCharArray();
		
		/*for(int i=0;i<s4.length();i++)
			System.out.println(c1[i] +"and" + (int) c1[i]);
		
		for(int j=65;j<91;j++)
			System.out.println(Character.toChars(j));*/
		
		char y = s4.charAt(1);
		String z = String.valueOf(s4.charAt(1));
		
		System.out.println(y + z);
				
	}

}
