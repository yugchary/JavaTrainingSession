package Logics;

import java.util.Arrays;

public class Validshuffle {

	// Function to check if String X and Y are interleaving of
		// String S or not
		public static boolean interleaved(String X, String Y, String S)
		{
			// return true if we have reached end of all Strings
			if (X.length() == 0 && Y.length() == 0 && S.length() == 0) {
				return true;
			}

			// return false if we have reached the end of String S
			// but String X or Y are not empty

			if (S.length() == 0) {
				return false;
			}

			// if String X is not empty and its first character matches with
			// first character of S, recurse for remaining substring

			boolean x = (X.length() != 0 && S.charAt(0) == X.charAt(0)) &&
					interleaved(X.substring(1), Y, S.substring(1));

			// if String Y is not empty and its first character matches with
			// first character of S, recurse for remaining substring

			boolean y = (Y.length() != 0 && S.charAt(0) == Y.charAt(0)) &&
					interleaved(X, Y.substring(1), S.substring(1));

			return x || y;
		}

		public static void main(String[] args)
		{
			String X = "ACBC";
			String Y = "ACD";
			String S = "ACDABCC";
			
			String str = new String();
			
			System.out.println(S);
			
			char c[]=S.toCharArray();
			
			Arrays.sort(c);
			S = String.copyValueOf(c);
			
			System.out.println(S);
			
			c =X.toCharArray();
			Arrays.sort(c);			
			X = String.copyValueOf(c);
			
			System.out.println(X);
			
			
			c =Y.toCharArray();
			Arrays.sort(c);			
			Y = String.copyValueOf(c);
			
			System.out.println(Y);
			
			/*str = String.valueOf(c);
			
			str = new String(c);
			
			System.out.println(str);
			
			StringBuilder sb = new StringBuilder();
			
			for (char ch: c) {
				sb.append(ch);
			}
			
			String string = sb.toString();
			System.out.println(string);
			
			S = str*/;
			

			if (interleaved(X, Y, S)) {
				System.out.print("Given String is interleaving of X and Y");
			} else {
				System.out.print("Given String is not interleaving of X and Y");
			}
		}

}
