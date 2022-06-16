package NaveenAutomationLabs.FA_Java;

public class swap {

	public static void main(String[] args) {

		int a=4;
		int b=7;
		int temp;
		System.out.println(a+" "+b);		
		
		temp=b;
		b=a;
		a=temp;
		System.out.println(a+" "+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
		
	}

}
