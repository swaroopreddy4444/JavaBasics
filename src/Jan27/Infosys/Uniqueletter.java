package Jan27.Infosys;


public class Uniqueletter {
	
	
	public static int getUniqueLetter(String s)
	{
		
	     for (int i = 0; i < s.length(); i++) 
	     {
             char ch = s.charAt(i);
             if(s.indexOf(ch)==s.lastIndexOf(ch)) 
             {
            	 return i+1;
             }
	     }
	     return -1;
//		int count=1;
//		int len=s.length();
//		int x=0;
//		String org=s;
//		for(int i=0;i<=s.length();i++)
//		{
//			org=s.replace(s.charAt(i)+"","");
//			if(len==org.length()+1)
//			{
//				x=1;
//				break;
//			}
//			System.out.println(s.length()+" "+len);
//			count++;
//		}
//		if (count==len&&x==0)
//		{
//			count=-1;
//		}
	//	return count;
	}
	
			
	public static void main(String[] args) {

		System.out.println(getUniqueLetter("statistics"));
		
	}

}
