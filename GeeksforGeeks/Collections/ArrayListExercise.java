package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExercise {
	
	
	static void add_to_arrayList(ArrayList<Integer> ar, int x) {
		
		ar.add(x);
		
	}
	
	static void print_all(ArrayList<Integer> ar) {
		
		/*for(int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));*/
		
		Iterator<Integer> it = ar.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		/*for(int k:ar)
			System.out.println(k);*/
		
		
		
	}
	
	static ArrayList<Integer> sort_Asc(ArrayList<Integer> ar) {
		
		Collections.sort(ar);
		return ar;
		
	}
	
	static ArrayList<Integer> reverse_sort(ArrayList<Integer> ar) {
		
		Collections.reverse(ar);
		return ar;
	}
	

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer> ();
		ArrayList<Integer> ar1 = new ArrayList<Integer> ();
		
		add_to_arrayList(ar, 1);	
		add_to_arrayList(ar, 22);
		add_to_arrayList(ar, -3);
		add_to_arrayList(ar, 4);
		add_to_arrayList(ar, 44);
		add_to_arrayList(ar, 3);
		add_to_arrayList(ar, 22);
		
		System.out.println("inserted order (1,22,3,-4,44,3,22) followed");
		System.out.println(ar);
		//print_all(ar);
		
		System.out.println("sort in ascending");
		
		ar1 = sort_Asc(ar);
		print_all(ar1);
		
		/*ar = reverse_sort(ar1);
		print_all(ar);	*/
		
		System.out.println("sortin reverse");
		
		Collections.sort(ar, Collections.reverseOrder());
		print_all(ar);

	}

}
