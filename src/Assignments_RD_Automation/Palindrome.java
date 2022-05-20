package Assignments_RD_Automation;

public class Palindrome {

	public static void check(String str) {
		
		boolean p = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				p = false;
				break;
			}
		}
		if (p == true) 	System.out.println(str+" is palindrome"); 
		else 			System.out.println(str+" is not palindrome");
	}

	public static void main(String[] args) {
		check("malayalam");
	}
}
