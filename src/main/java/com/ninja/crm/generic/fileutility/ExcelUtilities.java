package com.ninja.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
public String readthedatafromexcel(String sheet,int Row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./src/main/resources/testscriptdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet(sheet).getRow(Row).getCell(cell).getStringCellValue();
	return data;
	
}
//public void readmultipledata()//we can use dataprovider {
	
}


