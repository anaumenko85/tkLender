package com.example.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WorkWithExcel {
	
	public void testLogin() throws Exception {
		//readFromExcel("D:\\Projects\\Ultrafinance\\Localization.xls");
		readFromExcel(ConfigProperties.getProperty("excel.path"));
	  }

	@SuppressWarnings("deprecation")
	public static void readFromExcel(String file) throws IOException{
	HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
    HSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");
    HSSFRow row = myExcelSheet.getRow(0);
    
    if(row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING){
        String name = row.getCell(0).getStringCellValue();
        System.out.println("name : " + name);
    }
    
    if(row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
        Date birthdate = row.getCell(1).getDateCellValue();
        System.out.println("birthdate :" + birthdate);
    }
    
    myExcelBook.close();
}

}
