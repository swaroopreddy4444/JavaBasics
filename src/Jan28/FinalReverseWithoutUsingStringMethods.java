package Jan28;

import java.util.Arrays;

public class FinalReverseWithoutUsingStringMethods {
	  
    public static void main(String[] args) {

    	 String str = "Saket Saurav";
//    	 String str1 = new String("Saket Saurav");
//    	 System.out.println(str.equals(str1));
//    	 System.out.println(str==str1);
       StringBuilder str2 = new StringBuilder(str);
         
         System.out.println(str2);
         //         str2.append(str);
//         str2 = str2.reverse();     // used string builder to reverse
        String temp="";
    	 for(int i=0;i<str2.length();i++)
        {
//        	temp+=str.charAt(i)+"";
        	
    		 if((str.charAt(i)+"").equals(" ")) {
    			 str2.replace(i,i+1,"");
    		 }
    		 
//        	str(i)=str.charAt(str.length()-1);
        	
    	 
         }
    	 String str1 = "Saket Saurav        is a QualityAna    list";
    	  
         //1. Using replaceAll() Method
    	 String a[]=str1.split(" ");
    	 System.out.println(Arrays.toString(a));
    	 String str3=""; 
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if(a[i].length()>=1)
    		 {
    			 str3+=(a[i]+" ");
    		 }
    	 }
//         String str2 = str1.replace(" ", "");

         System.out.println(str3.trim());
         System.out.println(str2);
    	 System.out.println(temp);
    }
}