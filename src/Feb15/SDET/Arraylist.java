package Feb15.SDET;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		Object a[]=new Object[4];
		
		a[0]=100;
		a[1]="swaroop";
		a[2]='A';
		a[3]=10.5;
	
		for(Object x:a) {
			System.out.print(x+"\t\t");
		}
		System.out.println();
	
		ArrayList al=new ArrayList();
				
		al.add("sai");
		al.add(4);
		al.add('C');
		al.add(true);
		al.add("super");
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(4);
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(2,10.5);
		System.out.println(al);
		System.out.println(al.size());
		
		for(Object x:al) {
			System.out.print("\n"+x);
		}
	}

}
