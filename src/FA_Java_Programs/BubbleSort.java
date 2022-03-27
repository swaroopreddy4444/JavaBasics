package FA_Java_Programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a= {11,5,1,21,0,10,16,12};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			int c=0;
			for(int j=0;j<a.length-1;j++) {
		
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					c++;
				}
			}
			System.out.println(Arrays.toString(a));
			if(c==0) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
