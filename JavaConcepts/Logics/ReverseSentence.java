package Logics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sent =  "Java	is best	programming	language";
		
		String words[] = sent.split("\\s");
		
		List<String> lst = Arrays.asList(sent.split("\\s"));
		
		Collections.reverse(lst);
		
		Iterator<String> it = lst.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		for(String str: words) {
			//System.out.println(str);
		}
		
		for(int j=words.length-1; j>=0; j--)
			System.out.print(words[j]+ " ");

	}

}
