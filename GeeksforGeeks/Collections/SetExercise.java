package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SetExercise {
	
	public static void insert_into_set(HashSet<Integer> hs, int x ) {
		
		hs.add(x);
		
	}
	
	public static void print_all_from_set(HashSet<Integer> hs) {
		
		/*Iterator<Integer> it = hs.iterator();		
		while(it.hasNext())
			System.out.println(it.next());*/
		
		for(int i:hs)
			System.out.println(i);
	}
	
	public static void print_reverse_from_set(HashSet<Integer> hs) {
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.addAll(hs);
		Collections.reverse(ls);
		
		for(int i:ls)
			System.out.println(i);
		
		
		
	}
	

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		insert_into_set(hs, 1);
		insert_into_set(hs, 22);
		insert_into_set(hs, 3);
		insert_into_set(hs, -4);
		insert_into_set(hs, 5);
		insert_into_set(hs, 66);
		insert_into_set(hs, 3);
		
		System.out.println("inserted order (1,22,3,-4,5,66,3) NOT followed ");
		System.out.println(hs);
		
		//print_all_from_set(hs);		
		
		
		System.out.println("reverse");
		
		print_reverse_from_set(hs);
		

	}

}
