package Logics;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDupChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bananas";
		String dup = "";
		
		Map<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
		Set<Character> set = new LinkedHashSet<Character>();
		//Set<Character> set = new HashSet<Character>();
		//SortedSet<Character> set = new TreeSet<Character>();
		
		/*for(int i=0;i<str.length();i++)
			hm.put(str.charAt(i), (hm.containsKey(str.charAt(i)) ? hm.get(str.charAt(i))+1 :1));*/
		
		for(char c: str.toCharArray()) {
			hm.put(c, hm.containsKey(c)?hm.get(c)+1:1);
		}
		
		
		
		for(Entry<Character,Integer> e: hm.entrySet()) {
			//if (e.getValue() <= 1)
				set.add(e.getKey());
		}
		
		//List<Character> lst = new ArrayList<Character>();
		
		//lst.addAll(set);
		
		//Collections.sort(lst);
		
		System.out.println(set.toString());
		
		
		
		
		/*for(int i=0;i<str.length();i++)
			set.add(str.charAt(i));*/
		
		System.out.println(set.toString());
		
		/*for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
				if(!dup.contains(String.valueOf(str.charAt(j)))) {
					dup+=str.charAt(j);
					str = str.replace(str.charAt(j)+"", "");
					break;
					
				}
				}
			}
			
			
		}*/
		//System.out.println(dup+"and"+str);
	}

}
	