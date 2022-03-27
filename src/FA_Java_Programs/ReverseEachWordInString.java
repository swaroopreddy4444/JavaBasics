package FA_Java_Programs;

import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String str="   Java with selenium study by sai swaroop reddy ";
		
		str=str.trim();
		System.out.println(str);
		String[] words=str.split("\\s");
		String revstr="";
		
//		for(String w:words) {
//			String rev="";
//			for(int j=0;j<w.length();j++) {
//				rev=w.charAt(j)+rev;
//			}
//			revstr+=" "+rev;
//		}
		
		for(String w:words) {
			StringBuffer sb=new StringBuffer(w);
			sb.reverse();
			revstr+=" "+sb.toString();
		}
		
		System.out.println(revstr.trim());
	}
}