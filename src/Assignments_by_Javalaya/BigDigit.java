package Assignments_by_Javalaya;

public class BigDigit {

	public static void LargeDigit(int num) {

		int digit = num % 10;
		while (num != 0) {
			num /= 10;
			digit = num % 10 > digit ? num % 10 : digit;
		}
		System.out.println(digit);

	}

	public static void main(String[] args) {

		LargeDigit(37544867);

	}

}
