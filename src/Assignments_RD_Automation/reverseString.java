package Assignments_RD_Automation;

public class reverseString {

	public static void reverse(String str) {

		for(int i=0;i<str.length();i++) {
			str = str.charAt(str.length())+str;
			str = str.substring(1, str.length());
		}
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {


		reverse("super");
		
		
	}

}
