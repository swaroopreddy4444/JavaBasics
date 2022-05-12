package Assignments_by_Javalaya;

public class UniqueChars {

	public static void main(String[] args) {

		String str = "Java #2 Standard Edition";

		String unique = "";

		while (str.length() > 0) {
			unique = str.charAt(0) + "";
			str = str.replaceAll(unique, "");
			System.out.print(unique);
		}

	}
}
