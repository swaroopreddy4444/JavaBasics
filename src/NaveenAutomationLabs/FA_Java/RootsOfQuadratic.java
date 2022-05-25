package NaveenAutomationLabs.FA_Java;

public class RootsOfQuadratic {

	public static void main(String[] args) {

		double a = 1.2;
		int b = -8;
		double c = 7.5;
		System.out.println(a + "x2 + " + b + "x + " + c);
		double det = b * b - 4 * a * c;
		if (det >= 0) {
			double x1 = (-b + Math.sqrt(det)) / (2 * a);
			double x2 = (-b - Math.sqrt(det)) / (2 * a);
			System.out.printf("x1 = %.2f\n"  ,x1);
			System.out.printf("x2 = %.2f" , x2);
		} else {
			double real = -b / (2 * a);
			double imag = Math.sqrt(-det) / (2 * a);
			System.out.printf("x1 = %.2f+%.2fj\n", real,imag);
			System.out.printf("x2 = %.2f-%.2fj", real,imag);

		}

	}

}
