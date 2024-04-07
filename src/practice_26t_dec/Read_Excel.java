package practice_26t_dec;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Read_Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// print swami
		System.out.println("Shree swami samarth");
		

		// Open the file by passing path
		File objfile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Sample_text_file.xlsx");
		// read file
		FileInputStream fis = new FileInputStream( objfile);
		// read the excelbook by XSSFWORKBOOK 
		XSSFWorkbook excelbook = new XSSFWorkbook(fis);
		// read cellvalue
		String cellvalue = excelbook.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(cellvalue);
		
		
		

	}

}
