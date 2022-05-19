package Assignments_RD_Automation;


public class reverseString {

	public static void reverse(String str) {
		for (int i = 1; i < str.length(); i+=2) {
			str = str.charAt(i) + str;
		}
		str = str.substring(0, (str.length()+1)/2);
		System.out.println(str);
	}

	public static void main(String[] args) {

		reverse("god");

	}

}
