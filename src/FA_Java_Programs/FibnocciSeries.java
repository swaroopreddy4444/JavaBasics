package FA_Java_Programs;

public class FibnocciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,fib;
		System.out.print(a+" "+b);
		for(int i=2;i<30;i++) {
			fib=a+b;
			System.out.print(" "+fib);
			a=b;
			b=fib;
		}
	}
}