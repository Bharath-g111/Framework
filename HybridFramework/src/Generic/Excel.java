package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	
	public static String getData(String sheet, int row, int column) throws EncryptedDocumentException, IOException
	{
		String val ="";
		FileInputStream fis=new FileInputStream("./Excel/Untitled 1.xlsx"); /*Specfiy path*/
		Workbook book = WorkbookFactory.create(fis); //opens excel file
		Cell c = book.getSheet(sheet).getRow(row).getCell(column); // goes to particular sheet, row, column
	    return val=c.getStringCellValue();
		
	}
	

}
