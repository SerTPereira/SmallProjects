package com.projects.sgtp.ReadExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream streamPlanilha;
		
		try {
			File file = new File("C:\\DevTools\\Pasta.xlsx");
			streamPlanilha = new FileInputStream(file);
			
			XSSFWorkbook workbook = new XSSFWorkbook(streamPlanilha);			
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext()) {
				
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.iterator();
								
				while(cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					
					switch (cell.getCellType()) {
					
					case STRING:
						System.out.println("Tipo String: " + cell.getStringCellValue());
						break;

					case NUMERIC:
						System.out.println("Tipo Numeric: " + cell.getNumericCellValue());
						break;
						
					case BOOLEAN:
						System.out.println("Tipo Boolean: " + cell.getBooleanCellValue());
						break;
						
					case FORMULA:
						System.out.println("Tipo Formula: " + cell.getCellFormula());
						switch (cell.getCachedFormulaResultType()) {
						case STRING:
							System.out.println(" >> Last Eval: " + cell.getStringCellValue());
							break;

						case NUMERIC:
							System.out.println(" >> Last Eval: " + cell.getNumericCellValue());
							break;
							
						default:
							System.out.println("Not Expected Type:  " + cell.getCachedFormulaResultType().name());
							break;
						}
						
//						System.out.println("Tipo Formula Result: " + );
//						System.out.println("Tipo Formula Result: " + cell.getStringCellValue());
						break;						

					case ERROR:
						System.out.println("Tipo Error: " + cell.getErrorCellValue());
						break;
						
					default:
						System.out.println("Not Expected Type:  " + cell.getCellType().name());
						break;
					}
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e.getMessage());
		}
		
	}

}
