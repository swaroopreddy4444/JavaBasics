package FA_Java_Programs;

import java.util.HashSet;

public class ArrayDuplicateElement {

	public static void main(String[] args) {

		String[] a= {"java","python","C","C++","java","java","java"};
//	
//		int x=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//			
//				if(a[i]==a[j]) {
//					System.out.println(a[i]);
//					x=1;
//				}				
//			}
//		}
//		if(x==0) {
//			System.out.println("No Duplicates found");
//		}
		
		
		int dup=0;
		HashSet pro=new HashSet();
		
		for(String x:a) {
			if(pro.add(x)==false) {
				System.out.println(x);
				dup=1;
			}
		}
		if(dup==0) {
			System.out.println("No Duplicates found");
			}
		
	}
}
