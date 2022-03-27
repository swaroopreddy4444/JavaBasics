package FA_Java_Programs;

public class EvenOddFromArray {

	public static void main(String[] args) {

		int a[]= {12,14,43,23,72,57};
		System.out.println("Even.........");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("Odd..........");
		for(int j=0;j<a.length;j++) {
			if(a[j]%2!=0) {
				System.out.println(a[j]);
			}
		}
	}

}
