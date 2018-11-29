package OOPConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x =10, y=20;
		obj.sum(x, y);		//call by value or pass by value
		
		System.out.println("*******");
		obj.swap(x, y);
		System.out.println("the value of x "+x);
		System.out.println("the value of y "+y);
		
		System.out.println("*******");
		
		obj.p = 50;
		obj.q = 60;
		
		//after swap
		obj.swap(obj);		// call by reference is achieved by using the object references
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int sum(int i, int j) {
		
		return i+j;
	}
	
	public void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("in swap");
		System.out.println("the value of x "+x);
		System.out.println("the value of y "+y);
	}

	
	public void swap(CallByValAndCallByRef t) {
		
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}
}
