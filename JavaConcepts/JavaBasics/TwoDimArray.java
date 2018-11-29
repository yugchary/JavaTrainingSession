package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[][] = new String[2][3];
		 
		System.out.println(x.length);  //total no. of rows
		System.out.println(x[0].length); //total no. of columns
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		
		x[1][0] = "1";
		x[1][1] = "2";
		x[1][2] = "3";
		
		for(int i=0; i<x.length; i++)
			for(int j=0; j<x[0].length; j++)
				System.out.println(x[i][j]);
		
		
		
		

	}

}
