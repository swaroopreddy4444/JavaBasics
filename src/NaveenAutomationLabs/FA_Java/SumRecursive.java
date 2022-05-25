package NaveenAutomationLabs.FA_Java;

public class SumRecursive {

	public static int sumof(int num) {
		if (num != 0) {
			return num + sumof(num - 1);
		} else {
			return num;
		}
	}

	public static void main(String[] args) {

		System.out.println(sumof(10));
	}

}
