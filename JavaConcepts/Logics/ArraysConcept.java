package Logics;

import java.util.Arrays;
import java.lang.System;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		Object b[] = new Object[10];
		
		//a[0] = new Arrays();
		
		a[0]=5;
		a[1]=2;
		a[2]=10;
		a[3]=7;
		a[4]=8;
		a[5]=1;
		a[6]=4;
		a[7]=3;
		a[8]=6;
		a[9]=9;
		
		int c[] = null;
		
		//Arrays.copyOf()
		
		
		
		//java.lang.System.arraycopy()
		
		c = Arrays.copyOf(a, 15);
		
		c[10]=14;
		c[11]=15;
		c[12]=12;
		c[13]=11;
		c[14]=13;
		
		
		Arrays.sort(c);
		
		//System.out.println(Arrays.binarySearch(a, 55));
		
		for(int i=0;i<15;i++)
			System.out.println(c[i]);
		
		
		
		
		b[0] = new Robot();
		b[1] = new Recursion();
		
	}

}
