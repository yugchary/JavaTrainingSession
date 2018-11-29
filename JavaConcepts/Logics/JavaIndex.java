package Logics;

public class JavaIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		
		String res = new String();
		
		
		for(char c: str.toCharArray()) {
						
			if (res.indexOf(c)<0) {
				res+=c;
			}
			
		}
		
		System.out.println(res);

	}

}
