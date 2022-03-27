package FA_Java_Programs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str="chinta sai swaroop reddy@ gmail. com";
		System.out.println(str);
		str=str.replaceAll("\\s", "");
		System.out.println(str);
			
	}

}
