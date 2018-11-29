package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExercise {
	
	public static HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
	public static void add_hashMap(int key, String value) {
		
		hm.put(key, value);
		
	}
	
	public static void print() {		
		
		for(Entry m: hm.entrySet()) 
			System.out.println(m.getKey() + " " + m.getValue());
			
	}
	
	public static void remove(int key) {
		hm.remove(key);
	}
	

	public static void main(String[] args) {
				
		add_hashMap(1, "one");
		add_hashMap(2, "two");
		add_hashMap(3, "three");
		add_hashMap(0, null);
		add_hashMap(44, "foury four");
		add_hashMap(5, "five");
		add_hashMap(6, "six");
		add_hashMap(6, "six");
		
		
		System.out.println("default print > 1,2,3");
		System.out.println(hm);
		
		System.out.println("print all values in has map (1 to 6 in order)");
		
		print();
		
		remove(5);
		
		System.out.println("After removing 5");
		print();
	

	}

}
