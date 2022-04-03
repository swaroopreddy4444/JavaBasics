package Udemy.Filewritng;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileWriting {

	public static void main(String[] args) throws IOException {
	
		File f = new File("E:\\bablu\\JavaPractice\\JavaBasics\\src\\Udemy\\FileWritng\\super.txt");
		FileWriter fr =new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fr);
		
		for (int i=1;i<4;i++) {
			for (int j=1;j<4;j++) {
			
				bw.write(i+""+j+"\t");
			}
			bw.write("\n");
		}
		bw.close();
	}
}
