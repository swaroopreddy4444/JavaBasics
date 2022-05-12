package Assignments_by_Javalaya;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondHighestChar {

	public static void main(String[] args) {

		String str = "Java #2 Standard Edition";
		int n = 2;
//
//		TreeSet<Character> allc = new TreeSet<>();
//
//		for (int i = 0; i < str.length(); i++) {
//			allc.add(str.charAt(i));
//		}
//		System.out.println(allc.toString());
//		System.out.println(new ArrayList<>(allc).get(allc.size() - n));

		// Method -2
		String str_bkp = str;

		String largest = "";

		for (int i = 0; i < n; i++) {

			while (str.length() > 1) {
				String temp = str.charAt(0) + "";
				str = str.charAt(0) == str.charAt(1) ? str.replaceAll(str.charAt(1) + "", "") + temp
						: (str.charAt(0) > str.charAt(1) ? str.replaceAll(str.charAt(1) + "", "")
								: str.replaceAll(str.charAt(0) + "", ""));
			}
			largest = str;
			str = str_bkp.replaceAll(largest, "");

		}
		System.out.println(n + " Largest : " + largest);
	}
}