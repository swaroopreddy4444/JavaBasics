package NaveenAutomationLabs.FA_Java;

public class FactorialRecursive {

	public static double fact(int num) {
		if (num != 0) {
			return num * fact(num - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {

		System.out.println(fact(12));
	}

}
