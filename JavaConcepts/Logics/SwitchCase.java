package Logics;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asdasxewersdd";
		int vow=0, cons=0;
		
		for(char c : str.toCharArray()) {
			
			switch(c) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vow++;
				break;
			default:
				cons++;
			
			
			}
			
		}
		
		System.out.println("vowesl:"+vow+"  conso:"+cons);
		

	}

}
