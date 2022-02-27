package Jan27.Vishal;

public class Palindrome {
	
	
	public static void main(String[] args) {

		String s="radar";
		int x=0;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)==s.charAt(s.length()-1-i))
			{
				
			}
			else
			{
				x=1;
				break;
			}
			
		}
		if(x==0)
		{
		System.out.println(s+" polindome");
		}
		else
		{
			System.out.println(s+" not polindome");
			
		}
//		boolean polindome=false;
//		for(int i=0;i<s.length()/2;i++)
//		{
//			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
//				polindome=true;
//			}else {
//				polindome=false;
//				break;
//			}
//		}
//		System.out.println(polindome);
	
//		int n=5; 
//		int k=0;
//		for(int i=2;k<n;i++)
//		{
//			
//			int count=0;
//			for(int j=1;j<=i;j++)
//			{
//				if(i%j==0)// only odd numbers
//				{
//					count++;			
//					
//				}
//			}
//			if(count==2)
//			{
//				System.out.println(i);	
//				k++;
//			}
//		
//		}
	}
	
}