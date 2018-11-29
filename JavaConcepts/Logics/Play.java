package Logics;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "01234567";
		
		System.out.println(x.substring(0,6));
		int k = Integer.parseInt(x);
		System.out.println(k);
		
		

		permutation("AAB");

	}



public static void permutation(String input) {
	permutation("", input);
}

private static void permutation(String perm, String word) {
if (word.isEmpty()) {
    System.err.println(perm + word);

} else {
    for (int i = 0; i < word.length(); i++) {
        permutation(perm + word.charAt(i), word.substring(0, i) 
                                + word.substring(i + 1, word.length()));
    }
}

}

}


