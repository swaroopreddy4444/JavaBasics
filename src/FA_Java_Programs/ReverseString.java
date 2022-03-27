package FA_Java_Programs;

public class ReverseString {

	public static void main(String[] args) {

		String str="abcd",rev="";
		
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		
		//Char array
//		char[] a=str.toCharArray();
//		for(int i=0;i<str.length();i++) {
//			rev=a[i]+rev;
//		}
		
		//StringBuffer 
//		StringBuffer sb=new StringBuffer(str);
//		System.out.println(sb.reverse());
//	
		System.out.println(rev);
	}
}
