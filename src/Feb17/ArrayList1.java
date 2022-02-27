package Feb17;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		
		ArrayList<Integer> intlist=new ArrayList<Integer>();
		
		ArrayList<String> Stringlist=new ArrayList<String>();
		
		list.add("swaroop");
		list.add("super");
		list.add(4);
		list.add('C');
		list.add(12.5);
		list.add(true);
		
		intlist.add(32);
		intlist.add(23);
		intlist.add(72);
		intlist.add(27);
		intlist.add(29);
		
		Stringlist.add("fight");
		Stringlist.add("super");
		
		System.out.println(list);
		System.out.println(intlist);
		System.out.println(Stringlist);
		
		System.out.println("size of ArrayList = "+list.size());
		
		list.remove(4);
		System.out.println(list);
		
		System.out.println("size of ArrayList = "+list.size());
		
		list.add(4,"gowthami");
		System.out.println(list);
		
		System.out.println("size of ArrayList = "+list.size());
		
		for(Object x:list) {
			System.out.println(x);
			
		}
		
	}

}
