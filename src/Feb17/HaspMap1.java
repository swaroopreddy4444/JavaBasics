package Feb17;

import java.util.HashMap;
import java.util.Map;

public class HaspMap1 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		HashMap<Integer,String> hmis=new HashMap<Integer,String>();

		hm.put("swaroop",4);
		hm.put("super",9);
		hm.put("gowthami",1);
		hm.put("chandra",2);
		hm.put("vishal",3);
		
		hmis.put(1, "swaroop");
		hmis.put(2, "super");
		hmis.put(3, "gowthami");
		hmis.put(4, "chandra");
		hmis.put(5, "vishal");


		System.out.println(hm);
		System.out.println(hmis);
		
		hm.remove("gowthami");
		System.out.println(hm);


		
		hmis.remove(4);
		System.out.println(hmis);
		System.out.println(hmis.entrySet());
		
		for(Map.Entry<Integer,String> x:hmis.entrySet()) {
			
			System.out.println(x.getKey()+"\t"+x.getValue());
		}
	}

}
