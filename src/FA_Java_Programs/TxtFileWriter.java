package FA_Java_Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw =new FileWriter("C:\\Users\\swaroop reddy\\Documents\\log.txt"); // to overwrite data
//		FileWriter fw =new FileWriter("C:\\Users\\swaroop reddy\\Documents\\log.txt",true); // to append data
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("I completed 30 programs");
		bw.write("\nincluding file read& write");
		bw.write("\nI will get a job soon");
		bw.close();
	
		
		
	
	}
	
	
}
