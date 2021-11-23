package com.projects.sgtp.ReadExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		FileImportUtil fileImport = new FileImportUtil();
		
		File file = new File("C:\\DevTools\\DevGeeksTemplate.xlsx");
		FileInputStream streamPlanilha;
		try {
			streamPlanilha = new FileInputStream(file);
			Classe classe = new Classe();
			fileImport.importarAlunosParaClasse(classe, streamPlanilha);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
