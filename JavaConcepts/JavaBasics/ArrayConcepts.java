package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upper bound/index  = n-1 (n is size of array)
		
		//dis adv of array
		//1. size of array is fixed - static array - to over come we use Collections - ListArray, Hashtable - use dynamic arrarys
		//2. stores only similar data types - to over we used Object Array
		
		int i[] = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		System.out.println(i.length);
		
		char c[] = new char[2];
		c[0] = '1';
		c[1] = 'k';
		// System.out.println(c[0]+c[1]); prints array memory location
		System.out.println(c);
		
		for(int j=0; j<2; j++)
			System.out.println(c[j]);
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[1]);
	
	
		System.out.println(c.length);
		// System.out.println(c[2]);  array index out of bound exception
		
		//Object Array: (Object is a class)
		//1. Object Array is used to store different data types values
		Object obj[] = new Object[5];
		//LHS = new RHS
		//RHS = object (is the real object, created in java memory)
		//LHS = object is referred by object name (obj)
		//object will hold only non static methods
		//static methods and variables are directly accessed by class
		
		
		obj[0] = "Tom";
		obj[1] = 26;
		obj[2] = 'M';
		System.out.println(obj[0]);
		System.out.println(obj[2]);
				

	}

}
