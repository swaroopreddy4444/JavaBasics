package NaveenAutomationLabs.FA_Java;

public class fibnacciSeries {

	public static void main(String[] args) {

		int a=0,b=1,c;
		
		for(int i=1;i<=10;i++) {
			c=a+b; // 0+1 1+1 1+2 2+3
			System.out.print(a+" "); // 0 1 1 2 3 5
			a=b; // 0->1 1->1 1->2 2->3
			b=c; // 1->1 1->2 2->3 3->5
		}
		
	}

}
