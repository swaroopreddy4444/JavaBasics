package Assignments_by_Javalaya;

public class Num2Halfs {

	public static void num2Halfs(int num) {
		String Snum=num+"";
			int split=Snum.length()/2;
			System.out.println( Snum.substring(0,split)+"\n"+Snum.substring(split,Snum.length()));
	}
	
	public static void number2Halfs(int num) {

		
		for(int tens=1;num>9;tens*=10,num%=10) {
			int n1=num/tens;
			
			System.out.println(num%tens);
		}
		
		
		

	}
	
	
	public static void main(String[] args) {
		
		number2Halfs(15);
	}
}
