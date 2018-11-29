package Logics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asdsf";
		
		Set<Character> set = new HashSet<Character>();
		List<Character> lst = new ArrayList<>();
		
		
		for(char c: str.toCharArray()) {
			/*if(!set.add(c)) {
				lst.add(c);
			}*/			
			if(set.contains(c)) continue;
			
			if(lst.contains(c)) {
				set.add(c);
				if(lst.contains(c)) {
					int  i = lst.indexOf(c);
					lst.remove(i);
				}					
			}				
			else				
				lst.add(c);			
		}
		
		System.out.println("set:");
		Iterator<Character> it = set.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("lst:");
		Iterator<Character> lstIt = lst.iterator();
		while(lstIt.hasNext()) {
			System.out.println(lstIt.next());
		}
		
		if(!lst.isEmpty()) System.out.println("non repeat: "+ lst.get(0));
		else
			System.out.println("all repeated");		
	}

}
