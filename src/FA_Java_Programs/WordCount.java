package FA_Java_Programs;

import java.util.Arrays;

public class WordCount {

	public static void main(String[] args) {
		
		String str="   Java with  selenium study by sai swaroop   reddy ";
		
		str=str.trim();
		System.out.println(str);
		int space=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				space++;
			}
		}
		if(space==0) {
			System.out.println("single word found");
		}
		else {
			System.out.println(space+1+" words found");
		}
	}
}
