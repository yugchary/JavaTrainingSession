package Logics;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abaycde asdf asdf bced";
		
		char vow[] = {'a','e','i','o','u'};
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		//HashMap<Character, Integer> lhm = new HashMap<Character, Integer>();
		boolean flag = false;
		
		for(char c: str.toCharArray()) {
			
			lhm.put(c, lhm.containsKey(c)? lhm.get(c)+1:1);
			
			
		}
			
		
		/*for(int i=0;i<str.length(); i++) {
			lhm.put(str.charAt(i),  lhm.containsKey(str.charAt(i))? lhm.get(str.charAt(i))+1:1);
		}*/
			//lhm.put(i, ""+str.charAt(i));
		
		for(Entry<Character, Integer> e: lhm.entrySet()) {
			//System.out.println(e.getKey() + "   " + e.getValue());
			
			if(e.getValue()==1 && flag == false) {
				System.out.println(e.getKey());
				flag = true;
				break;
			}
			
		
			
			
		}
		
		String vows = "aeiou";
		int vows_count=0;
		
		if(!flag) System.out.println("all repeated");
			
		for(Entry<Character, Integer> e: lhm.entrySet()) {
			
			if(vows.contains(e.getKey()+"")) vows_count=vows_count+ e.getValue();
			
			System.out.println(e.getKey() + "   " + e.getValue());
			
		}
			 
		System.out.println("count of vowlers:" + vows_count);
			
	}

}
