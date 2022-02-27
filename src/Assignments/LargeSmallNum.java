package Assignments;

public class LargeSmallNum {

	public static void main(String[] args) {

		int []a={1,2,3,4,345,43,432,21,342};
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		int res=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(res<=a[i]) {
				res=a[i];
			}
		}
		System.out.println("\nmax="+res);
		
		res=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(res>=a[i]) {
				res=a[i];
			}
		}
		System.out.println("min="+res);
	}
	

}
