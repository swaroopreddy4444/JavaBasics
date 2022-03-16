package Feb16.Hackerrank;

import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String a, String b) {

		a = a.toUpperCase();
		b = b.toUpperCase();
		String c=a;
		String d=b;
		
		boolean ret = false;
//		StringBuilder c = new StringBuilder(b);

		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
			
					if (b.contains(a.charAt(i)+"")) {
						
						
//						c=c.replaceFirst(a.charAt(i)+"", "");
//						d=d.replaceFirst(a.charAt(i)+"", "");
						
						c=c.replace(a.charAt(i)+"", "");
						d=d.replace(a.charAt(i)+"", "");
						
						if(c.length()!=d.length()) {
							break;
						}
						if(c.equals(d)) {
							ret=true;
							break;
						}
					}
					}

				}
		return ret;
			}
		
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}