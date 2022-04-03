package Udemy.Filewritng;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriting {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh1 = wb.createSheet("firstSheet");
		
		XSSFRow R0= sh1.createRow(0);
		
		XSSFCell A0= R0.createCell(0);
		XSSFCell B0= R0.createCell(1);
		
		A0.setCellValue("1 value");
		B0.setCellValue("2 value");

		File f = new File("E:\\bablu\\JavaPractice\\JavaBasics\\src\\Udemy\\ExcelPOI\\new1.xlsx");
		FileOutputStream fo =new FileOutputStream(f);
		
		wb.write(fo);
		
		fo.close();
		wb.close();
		System.out.println("Excel written succesfully");
	}

}
