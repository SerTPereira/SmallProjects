package com.projects.sgtp.ReadExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Importação de Arquivos utilizando Apache POI
 * 
 * https://poi.apache.org/
 * 
 * @author SergioGTP
 *
 */
public class FileImportUtil {

	/**
	 * Importação arquivo Excel via FileStream.
	 * 
	 * @param fileStream
	 */
	public void importExcelFile(FileInputStream fileStream) {
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
			
			int sheetCount = workbook.getNumberOfSheets();
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = (Row) rowIterator.next();
				
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = (Cell) cellIterator.next();
					
					int rowIndex = cell.getRowIndex();
					int columnIndex = cell.getColumnIndex();
					CellAddress cellAddress = cell.getAddress();
					
					switch (cell.getCellType()) {
					case STRING:
						System.out.println("Extract [row: " + rowIndex + ", column: " + columnIndex + "]: " + cell.getStringCellValue());
						System.out.println("Address: " + cellAddress);
						break;
						
					case NUMERIC:
						System.out.println("Extract [row: " + rowIndex + ", column: " + columnIndex + "] (Double): " + cell.getNumericCellValue());
						System.out.println("Extract [row: " + rowIndex + ", column: " + columnIndex + "] (Integer): " + ((int) cell.getNumericCellValue()));
						System.out.println("Address: " + cellAddress);
						break;

					default:
						System.out.println("Valor inválido encontrado na planilha de importação.");
						System.out.println("Address: " + cellAddress);
						System.out.println("[row: " + rowIndex + ", Column: " + columnIndex + "]");
						break;
					}					
				}
				
				System.out.println("");
				System.out.println(" --- ");
				System.out.println("");
			}
			
			workbook.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	/**
	 * Teste baseado no vídeo: https://youtu.be/qH5Yu34Unvg
	 * Tutorial Java - Ler arquivo xlsx com java - Planilha Excel
	 * 
	 */
	public void testeInicial() {
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
