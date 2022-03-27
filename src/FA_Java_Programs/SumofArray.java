package FA_Java_Programs;

public class SumofArray {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5 };
		int sum = 0;
		
//		for(int i=0;i<a.length;i++) {
//			sum+=a[i];
//		}
		
		for(int x:a) {
			sum+=x;
		}
		
		System.out.println(sum);
	}
}
