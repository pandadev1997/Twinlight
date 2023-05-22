package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File_Utility {
	/**
	 * This method help us to fetch data from excel sheet
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public String fetch_data_from_excel(String sheet,int row,int cell) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstant.excelfil);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return value;
	}
	
	public void store_data_into_excel(String sheet,int row,int cell,String value) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstant.excelfil);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(Iconstant.excelfil);
		wb.write(fos);
		wb.close();
	}

}
