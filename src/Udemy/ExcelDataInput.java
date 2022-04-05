package Udemy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataInput {

			public static void main(String[] args) throws IOException {

				XSSFWorkbook wb =new XSSFWorkbook();		
				XSSFSheet s1= wb.createSheet("Sheet1");
				
				Row r1 =s1.createRow(0);
				
				Cell A1=r1.createCell(0);
				Cell B1=r1.createCell(1);
				Cell C1=r1.createCell(2);
				Cell D1=r1.createCell(3);

				A1.setCellValue("First Name");
				B1.setCellValue("Last Name");
				C1.setCellValue("Email");
				D1.setCellValue("Mobile");

				s1.setDefaultRowHeight((short) 350);
				s1.setDefaultColumnWidth(35);
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter No. of Persons: ");
				int n=sc.nextInt();
				for(int r=1;r<n+1;r++) {
					Row row=s1.createRow(r);
					for(int c=0;c<4;c++) {
						Cell cell=row.createCell(c);
						switch(c) {
						case 0: System.out.print("F Name: "); cell.setCellValue(sc.next()); break;	
						case 1: System.out.print("L Name: "); cell.setCellValue(sc.next());	break;
						case 2: System.out.print("Email: "); cell.setCellValue(sc.next());	break;
						case 3: System.out.print("Mobile: "); cell.setCellValue(sc.next());	break;
						default: break;
						
						}
													
					}
				}
				sc.close();
		
			File f =new File("E:\\bablu\\JavaPractice\\JavaBasics\\src\\Udemy\\HashMapSample.xlsx");

			FileOutputStream fo =new FileOutputStream(f);
			
			wb.write(fo);
			
			fo.close();
			wb.close();
				
			
	}
}
