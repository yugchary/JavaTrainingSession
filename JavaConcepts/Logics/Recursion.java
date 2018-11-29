package Logics;

public class Recursion {
	static int n=51;
	static double a[] = new double[n];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				
		
		//System.out.println("Factorial of n ="+fact(n));
		//System.out.println("Fibonaci series for n=");
		
		/*for (int i=1;i<=n;i++) 
			System.out.println(fib(i)+",");*/
		
		//backtrack(n, a);
		
		System.out.println("fib seris for n=");
		
		for (int i=1;i<n;i++) 
			System.out.println(fibmemo(i)+",");	
		
	}

	static int fact(int n) {
		if (n>=1) return (n * fact(n-1));
		else
			return 1;
	}
	
	static double fib(int n) {
		if (n>2) return (fib(n-1) + fib(n-2));
		else
			return 1;
	}
	
	static double fibmemo(int n) {
		double result;
		if (a[n]!=0.0)
			return a[n];
		if(n>2) result = (fibmemo(n-1) + fibmemo(n-2));
		else
			result= 1;
		
		a[n] = result;
		return result;
				
	}
	
	
	static void backtrack(int n, double a[]) {
		a[0]=1;
		a[1]=1;
		for(int i=2;i<n;i++)
			a[i]=a[i-1]+a[i-2];
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	
	
}
