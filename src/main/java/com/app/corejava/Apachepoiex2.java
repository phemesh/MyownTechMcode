package com.app.corejava;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Apachepoiex2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File(System.getProperty("user.dir") + "/excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		// This step useful for reading data from excel;
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);
		/*
		 * Row row= sheet.getRow(0); //It will access first row Cell
		 * cell=row.getCell(0); //first row it will access first cell
		 * System.out.println(cell); //prints the first cell
		 */

		// foreach row
		for (Row row : sheet) {
			// for each cell
			for (Cell cell : row) {

				// it checks the type of cell
				switch (cell.getCellType()) {
				// it will see if numeric prints all numeric numbers
				case NUMERIC: {
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				}
				// if string prints string values
				case STRING: {
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				}
				default:
					break;

				}

			}
			System.out.println();
		}

	}

}
