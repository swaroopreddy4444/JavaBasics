package Assignments_by_Javalaya;

public class CharSpecifications {

	public static void main(String[] args) {

		String str = "Java #2 Standard Edition";
		int total = str.length();
		System.out.println(str + "\nTotal chars = " + total);

		int remaining = str.length();
		int count = 0;
		
		total = str.length();
		str = str.replaceAll("[a-z]", "");
		remaining = str.length();
		count = (total - remaining);

		System.out.println(" a-z : " + count);
		
		total = str.length();
		str = str.replaceAll("[A-Z]", "");
		remaining = str.length();
		count = total - remaining;
		
		System.out.println(" A-Z : " + count);
		
		total = str.length();
		str = str.replaceAll("[0-9]", "");
		remaining = str.length();
		count = total - remaining;
		
		System.out.println(" 0-9 : " + count);
		
		total = str.length();
		str = str.replaceAll(" ", "");
		remaining = str.length();
		count = total - remaining;
		
		System.out.println("Spaces : " + count);
		
		System.out.println("Special Chars : " + remaining);
		

	}
}
