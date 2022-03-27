package FA_Java_Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TxtFileReader {

	public static void main(String[] args) throws IOException {

//		FileReader fr =new FileReader("C:\\Users\\swaroop reddy\\Documents\\dat.log");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String str;
//		while((str=br.readLine())!=null) {			
//			System.out.println(str);
//		}
//		br.close();
	
		
		
//		File file=new File("C:\\\\Users\\\\swaroop reddy\\\\Documents\\\\dat.log");
//		Scanner sc =new Scanner(file);
//		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}

		File file=new File("C:\\Users\\swaroop reddy\\Documents\\dat.log");
		Scanner sc =new Scanner(file);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
	
	
	}
	
	
}
