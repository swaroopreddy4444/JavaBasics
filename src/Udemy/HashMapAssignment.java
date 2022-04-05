package Udemy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HashMapAssignment {

	public static void main(String[] args) throws IOException {

		File f =new File("E:\\bablu\\JavaPractice\\JavaBasics\\src\\Udemy\\HashMapSample.xlsx");

		FileInputStream fi =new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fi);
		
		Sheet s1 = wb.getSheetAt(0);
		
		HashMap<String,String> map= new HashMap<String,String>();
		ArrayList<String> array=new ArrayList<String>();
		
		for (Row r:s1) {
			
			for(Cell c: r) {
				
				array.add(c.getStringCellValue());
			}
		}
		System.out.println(array);
	}
}
