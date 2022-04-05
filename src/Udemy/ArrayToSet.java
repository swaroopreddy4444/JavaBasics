package Udemy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {

		Integer[] a= {9,1,12,3,4,5,7,1,2,6,4,5,8};
		
		Set<Integer> s=new HashSet<Integer>();
		Set<Integer> s1=new HashSet<>();
		
		Collections.addAll(s1, a); // collections add all to set from an array 
		
		for(int i:a) {
			s.add(i);
		}
		System.out.println(s);
		System.out.println(s1);
	}

}
