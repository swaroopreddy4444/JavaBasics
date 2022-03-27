package FA_Java_Programs;

public class SwapNumbers {

	public static void main(String[] args) {

		int a=10,b=20;
		System.out.println("Before swaping : "+a+", "+b);
		
		
//		  int t=a; a=b; b=t;
		  
		 
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
//		a=a^b;
//		b=a^b;
//		a=a^b;
		
		b=a+b-(a=b);
		
		System.out.println(" After swaping : "+a+", "+b);
		
	}

}
