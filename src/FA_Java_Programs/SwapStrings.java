package FA_Java_Programs;

public class SwapStrings {
    public static void main(String args[]) {
      String s1="hemanth",x="sai";
      String s2="reddy",y="swaroop";
      
      System.out.println(x+" "+y);
      x=x+y;
      y=x.replace(y,"");
      x=x.replace(y,"");
      System.out.println(x+" "+y);
      
      	System.out.println(s1+" "+s2);
		    s1 =s1+s2;
	    	s2=s1.substring(0, s1.length()-s2.length());
	    	s1= s1.substring(s2.length());
      	System.out.println(s1+" "+s2);
	


    }
}
