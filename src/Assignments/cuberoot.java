package Assignments;

public class cuberoot {

	public static void main(String args[]) {

		for (int i = 0; i <= 90000000; i++) {
			int temp = i;
			int sum = 0;
			while (temp != 0) {
				sum += (temp % 10);
				temp /= 10;
			}
			if (Math.cbrt(i) == sum) {
				System.out.println(i + " " + sum);
			}
		}
	}
}