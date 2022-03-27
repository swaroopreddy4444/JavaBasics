package FA_Java_Programs;

public class Charcount {

	public static void main(String[] args) {
		
		String str="Java with selenium study by sai swaroop reddy";
		
		char x='s';
		int p=str.length();
		str= str.replace(x+"", "");
		System.out.println(x+"= "+(p-str.length())+" times repeated");
	}
}
