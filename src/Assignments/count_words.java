package Assignments;

import java.util.HashMap;
import java.util.Map;

public class count_words {

	public static void main(String[] args) {

		String str = "i am c sai swaroop reddy who is learning java and learning selenium with java and also learning java with testNG";
		String[] list = str.split(" ");

		Map<String, Integer> words = new HashMap<String, Integer>();
		Integer count = 1;
		for (int i = 0; i < list.length; i++) {

			if (!words.containsKey(list[i])) {
				words.put(list[i], count);
			} else {
				words.put(list[i], words.get(list[i]) + 1);
			}
		}
		for(String x: words.keySet()) {
			System.out.printf("%-10s : %d\n",x,words.get(x));	
		}
		
	}

}
