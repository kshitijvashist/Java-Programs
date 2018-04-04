package com.algo.runlengthencoding;

public class RunlengthEncoding {

	// For example, if the input string is “wwwwaaadexxxxxx”,
	// then the function should return “w4a3d1e1x6”.

	public static void main(String args[]) {

		String str = "aaaabbbccdddddddeeffffff"; //input String

		String value = getRunLengthEncodingForGivenString(str); 
		System.out.println(value);
	}

	public static String getRunLengthEncodingForGivenString(String str) {
		String value = "", compare = "";

		for (int i = 0; i < str.length(); i++) {
			CharSequence seq = str.charAt(i) + "";

			if (compare.contains(seq))
				continue;

			compare = compare + str.charAt(i);

			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					count = count + 1;
			}

			value = value + str.charAt(i) + Integer.toString(count);
		}
		return value;
	}

}
