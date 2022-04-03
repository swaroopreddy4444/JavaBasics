package Assignments;


public class FindVowels {

	public static void main(String[] args) {

		String str="Welcome";
		
//		str=str.toLowerCase();
//		for(int i=0;i<str.length();i++) {
//			char x=str.charAt(i);
//			if(x=='a'||x=='e'||x=='o'||x=='i'||x=='u') {
//				System.out.println(x+" Vowel present");
//				break;
//			}
//		}
		
		System.out.println(str.replaceAll("[aeiouAEIOU]","").length()!=str.length()?"vowel present":"no vowel");
		System.out.println(-str.replaceAll("[aeiouAEIOU]","").length()+str.length());
			
		}
	
}
