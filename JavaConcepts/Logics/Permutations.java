package Logics;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> output = Permutations.generatePermutations("xyz");
		System.out.println("Result size: " + output.size());
		output.stream().forEach(System.out::println);
		System.out.println("------------------");

		/*
		 * output = Permutations.generatePermutations("ABCD");
		 * System.out.println("Result size: "+output.size());
		 * output.stream().forEach(System.out::println);
		 */
	}

	public static List<String> generatePermutations(String input) {

		List<String> strList = new ArrayList<String>();
		Permutations.permutations("", input, strList);

		return strList;
	}

	private static void permutations(String consChars, String input, List<String> opContainer) {

		if (input.isEmpty()) {
			opContainer.add(consChars + input);
			return;
		}

		for (int i = 0; i < input.length(); i++) {
			String x1 = consChars + input.charAt(i);
			String x2 = input.substring(0, i)+input.substring(i + 1);
			permutations(x1, x2, opContainer);
		}
	}

}
