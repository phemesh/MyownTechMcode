package com.app.corejava;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apachepoiex {
public static void main(String[] args) throws IOException {
	XSSFWorkbook xs=new XSSFWorkbook();
	// YOu need to create object for XSSFWorkbookclass to start work with for wwriting  into excel
	
	XSSFSheet sheet=xs.createSheet("Sheet01Selenium"); //Create sheet01 with name
	/*Row row= sheet.createRow(0); //For first row oth index
	Cell cell0=row0.createCell(0); //first row oth cell
	Cell cell1=row0.createCell(1); //first row second cell
	cell0.setCellValue("Table A"); //setting value to first row oth cell
	cell1.setCellValue("Table B");*/ //setting value to first row 1st cell
	
	//If you want to loop and iterate multiple values need to be set in  sheet follow belo
	
	for(int rows=0;rows<10;rows++) { //row cunt until 0 it wil iterate 
		Row row= sheet.createRow(rows);  //it will create rows
		for(int columns=0;columns<10;columns++) { //until column count it will iterate
			Cell cell=row.createCell(columns);  //create cells 
			cell.setCellValue((int)(Math.random()*100)); // writing value to each cell
		}
	}
	//connecting to streams
	File f=new File(System.getProperty("user.dir")+"/excel.xlsx");   
	FileOutputStream fo=new FileOutputStream(f);
	xs.write(fo);  //finally writing all values to excel
	fo.close();
	System.out.println("file create");
}
}
