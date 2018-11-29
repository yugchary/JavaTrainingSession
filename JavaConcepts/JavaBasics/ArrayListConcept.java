package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
	
	//ArrayList supports dynamic arrays that can grow as needed. Standard Java arrays are of a fixed length. 
	//After arrays are created, they cannot grow or shrink, which means that you must know in advance how many elements an array will hold.
	public static void main(String[] args) {
		
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(1);
		ar.add(2);
		ar.add("yug");
		ar.add('A');
		ar.add(12.2);
		ar.remove(1);
		
		for(int i =0; i< ar.size(); i++)
			System.out.println(ar.get(i));
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(1);
		ar1.add(2);
		

	}
	
	
	
	
	
}
