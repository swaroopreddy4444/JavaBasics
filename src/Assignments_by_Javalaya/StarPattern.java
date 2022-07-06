package Assignments_by_Javalaya;

public class StarPattern {

	public static void NstarsPattern(int i) {

//		for(String s="*";i--!=0;s=s.concat("*")) {
//			
//			System.out.println(s);
//	}
//	
	for (int j=1;j<=i;j++) {
		
		System.out.printf("%"+i+"s\n","*".repeat(j));
	}
}

	public static void main(String[] args) {
		
		NstarsPattern(4);
	}

}
