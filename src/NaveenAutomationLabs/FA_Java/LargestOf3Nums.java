package NaveenAutomationLabs.FA_Java;

public class LargestOf3Nums {

	public static void main(String[] args) {

		int a = 150;
		int b = 100;
		int c = 200;
		if (a > b && a > c) {
			System.out.println(a + " a is largest");
		} else if (b > c) {
			System.out.println(b + " b is largest");
		} else {
			System.out.println(c + " c is largest");
		}
		
		int res = (a>b)?((a>c)?a:c):(b>c?b:c);
		System.out.println(res + " is largest");
		
		int	res1 = c>(a>b?a:b)?c:(a>b?a:b);		
		System.out.println(res1 + " is largest");
		}

	
}
