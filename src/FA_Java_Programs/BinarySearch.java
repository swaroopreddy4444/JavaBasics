package FA_Java_Programs;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,6,7,8,9};
		
		int x=7;
// METHOD 1		
		int low=0;
		int high=a.length-1;
		boolean flag=false;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==x) {
				System.out.println("found "+x+" at index "+mid);
				flag=true;
				break;
			}
			low=(a[mid]<x)?mid+1:low;
			high=(a[mid]>x)?mid-1:high;		
		}
		if(flag==false) {
			System.out.println(x+ " Element not found");
		}
		
		// METHOD 2		
		int index=Arrays.binarySearch(a, x);
		if(index>=0)
			System.out.println("found "+x+" at index "+index);
		else {
			System.out.println(x+ " Element not found");
		}
	}
}
