package com.app.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CoreJavaReadingPropertiesfile {
	public static void main(String[] args) throws IOException {
		String rootPath = System.getProperty("user.dir"); /* Gives you the project path */
		FileInputStream fis = new FileInputStream(rootPath + "/configration.properties");
		
		/* Using file input stream concatinating from project path to properties file */
		Properties prop = new Properties();
		prop.load(fis); // giving knowledge of file path to properties class
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("globalurl"));
		
		//FileOutputStream fos = new FileOutputStream(rootPath + "/configration.properties");
		FileWriter fiw=new FileWriter(rootPath + "/configration.properties");
				
		//prop.setProperty("username", "Rebelstar");
		prop.setProperty("password", "makik");
		//prop.store(fos, "UserName");
	   prop.store(fiw, "pass");
		//System.out.println(prop.getProperty("username"));
	}
}
