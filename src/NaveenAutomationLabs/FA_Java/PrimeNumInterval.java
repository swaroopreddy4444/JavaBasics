package NaveenAutomationLabs.FA_Java;

public class PrimeNumInterval {

	public static void main(String[] args) {

		int first = 23, last = 50;

		while (first != last) {
			int prime = 0;
				for (int i = 2; i <= first / 2; i++) {
				if (first % i == 0) {
					prime = 1;
					break;
				}
			}
			if (prime == 0 && first > 1) {
				System.out.println(first);
			}
			first++;
		}
	}
}