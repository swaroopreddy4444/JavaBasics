package Assignments;

public class StringOperations {

	public static void main(String[] args) {


		String s1="Welcome";
		String s2="welcome";
		String s3=" to my course";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s3));
		System.out.println(s3.length());
		System.out.println(s3.substring(7,13));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
	}

}
