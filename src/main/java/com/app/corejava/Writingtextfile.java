package com.app.corejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writingtextfile {
public static void main(String[] args) throws IOException {
	
	File f=new File(System.getProperty("user.dir")+"/myown.txt");
	
	FileWriter fis=new FileWriter(f,true); 
	//Here true will append the values in text file other wise it will replace the existing values
	BufferedWriter bw=new BufferedWriter(fis);
	
	bw.write("Hemesh");
	bw.newLine();
	bw.write("Is  a ");
	bw.newLine();
	bw.write("Lover boy");
	bw.close();
	fis.close();
	System.out.println("file created");
	
	FileReader fiss=new FileReader(f);
	
	BufferedReader br=new BufferedReader(fiss);
/*int i;
while((i=br.read())!=-1){  
	 System.out.println((char)i);
      }  
*/
//readline will print very firstline
String line=null;
while((line=br.readLine())!=null) {
	System.out.println(line);
	
}

}
}
