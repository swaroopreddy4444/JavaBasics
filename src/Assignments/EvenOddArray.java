package Assignments;

public class EvenOddArray {

	public static void main(String[] args) {

		int []a= {1,2,3,4,345,43,432,21,342};
		System.out.println("Array");
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nEven");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println("\nOdd");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		
	}
}