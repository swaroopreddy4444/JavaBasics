package Udemy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs=new HashSet<>();
		
		hs.add("sai");
		hs.add(10);
		hs.add('a');
		hs.add(10.5);
		hs.add(null);
		hs.add(true);
		hs.add('a');
		hs.add(10.5);
		
		hs.remove(10);
		
		System.out.println(hs);
		
		for(Object x:hs)
		{
			System.out.println(x);
		}
		
		Iterator itr= hs.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
		
		
	}

}
