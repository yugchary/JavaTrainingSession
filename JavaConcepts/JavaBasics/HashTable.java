package JavaBasics;



import java.util.Hashtable;
public class HashTable {
	
	//It is also known as hash map is a data structure used to implement an associative array.It is a structure that can map keys to values. 
	//A hash table uses a hash function to compute an index into an array of buckets or slots, from which the correct value can be found.
	//Hashtable is synchronised

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put(1, "World");
		
		System.out.println(h);
		System.out.println(h.size());
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "first");
		h1.put(2, "second");
		
		
		
		for(int i=1;i<=h1.size();i++)
			System.out.println(h1.get(i));
	
		
		
				
		
	}

}
