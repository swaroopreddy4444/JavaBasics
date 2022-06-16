package NaveenAutomationLabs.FA_Java;

public class VowelOrConsonant {

	public static void main(String[] args) {

		char x = 'i';

		String res = (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') ? "Vowel" : "Consonant";

		System.out.println(x + " is " + res);

		switch (x) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(x + " is " + res);
			break;
		default:
			System.out.println(x + " is " + res);
			break;
		}

	}

}
