package Logics;

import java.util.Arrays;

public class Anagrams {

	private static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char str1[] = ("abcca").toCharArray();
		char str2[] = ("ccaab").toCharArray();

		if (areAnagram(str1, str2))
			System.out.println("The two strings are" + "anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
		rough();
	}

	static boolean areAnagram(char str1[], char str2[]) {
		// Create 2 count arrays and initialize
		// all values as 0
		int count1[] = new int[NO_OF_CHARS];
		Arrays.fill(count1, 5);
		int count2[] = new int[NO_OF_CHARS];
		Arrays.fill(count2, 5);
		int i;

		// For each character in input strings,
		// increment count in the corresponding
		// count array
		for (i = 0; i < str1.length && i < str2.length; i++) {
			count1[str1[i]]++;
			count2[str2[i]]++;
		}

		// If both strings are of different length.
		// Removing this condition will make the program
		// fail for strings like "aaca" and "aca"
		if (str1.length != str2.length)
			return false;

		// Compare count arrays
		for (i = 0; i < NO_OF_CHARS; i++)
			if (count1[i] != count2[i])
				return false;

		return true;
	}

	public static void rough() {
		/*
		 * String str1 = "abcca"; String str2 = "ccaab"; boolean FLAG = true;
		 * 
		 * int count = 0; int count1; boolean flag = true; if (str1.length() ==
		 * str2.length()) { for (int i = 0; i < str1.length(); i++) { count1 = 0; if
		 * (flag) { for (int j = 0; j < str2.length(); j++) if (str1.charAt(i) ==
		 * str2.charAt(j)) count++; else { count1++; if (count1 == str1.length()) { flag
		 * = false; System.out.println(j); }
		 * 
		 * } } else break;
		 * 
		 * } if (count == str1.length()) System.out.println("anagaram"); else
		 * System.out.println("not anangram");
		 * 
		 * } else System.out.println("not anangram");
		 */

		/*
		 * int i, j; String s1 = "abcca"; String s2 = "cccab"; boolean FLAG = true; i =
		 * s1.length(); j = s2.length();
		 * 
		 * if (i == j) { for (int k = 0; k < i; k++) { for (int l = 0; l < i; l++) { if
		 * (s1.charAt(k) == s2.charAt(l)) { FLAG = true; break; } else FLAG = false; } }
		 * } else FLAG = false; if (FLAG)
		 * System.out.println("Given Strings are anagrams"); else
		 * System.out.println("Given Strings are not anagrams");
		 */

	}

}
