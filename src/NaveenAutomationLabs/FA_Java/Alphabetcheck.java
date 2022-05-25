package NaveenAutomationLabs.FA_Java;

public class Alphabetcheck {

	public static void main(String[] args) {

		char x = '_';

		if (('a' <= x && x <= 'z') || ('A' <= x && x <= 'Z')) {
			System.out.println(x + " is a alphabet");
		} else {
			System.out.println(x + " is not a alphabet");
		}
	}

}
