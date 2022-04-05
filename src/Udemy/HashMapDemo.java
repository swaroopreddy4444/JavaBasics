package Udemy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap hm=new HashMap<>();
		
		hm.put("email","swaroopreddy4444@gmail.com");
		hm.put("password","gmail@2019");
		hm.put("PINCODE", 515261);
		hm.put("DOB", "12-01-1994");
		hm.put("MPIN", 515261);
		hm.put("password","gmail@2021");
		
		System.out.println(hm);

		System.out.println(hm.get("email")); //swaroopreddy4444@gmail.com
		System.out.println(hm.get("MPIN")); // 515261
		
		System.out.println(hm.get("Mpin")); // not existing key =null
		
		Set keys= hm.keySet();
		
		Iterator itr =keys.iterator();
		
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj+"="+hm.get(obj));
		}
		
	}
	
	
	
}