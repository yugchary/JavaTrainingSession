package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		int y = 200;
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1.charAt(s1.length()));
		
		System.out.println(x + y + s1 + s2);
		System.out.println(s1 + s2 + x + y);
		System.out.println(s1 + s2 + (x + y));

		String str = "Selenium-HP-java-qtp";
		String sarray[] = str.split("-");

		for (int i = 0; i < sarray.length; i++) {
			System.out.println(sarray[i]);
			if (sarray[i].equalsIgnoreCase("selenium")) {
				System.out.println(sarray[i]);
				break;
			}

		}

	}
}
