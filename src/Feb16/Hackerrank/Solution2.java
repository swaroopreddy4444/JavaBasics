package Feb16.Hackerrank;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] splits = s.split("[^a-zA-Z]+");
      //  splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
//        int c=0;
//        for(String x:splits) {
//        	if(x!="") {
//        	c++;
//        		}
//        	}
        
//    
//        System.out.println(c);
        
        System.out.println(splits.length);
        for(String x:splits) {
//        	if(x!="") {
        	System.out.println(x);	
//        		}
        	}
    }
}

