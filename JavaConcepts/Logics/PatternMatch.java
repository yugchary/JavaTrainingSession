package Logics;

import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		String str = "Pro3gramming";
		int vowel = 0;
		int consonents = 0;
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			if (Pattern.matches("[a-z,1-7]", Character.toString(c)))
				vowel++;
			else {
				consonents++;
			}
		}
		System.out.println(vowel + " " + consonents);
	}

}
