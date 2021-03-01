package com.app.corejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class htmltext {
public static void main(String[] args) throws IOException {
	File f=new File(System.getProperty("user.dir")+"/myown.html");
	FileWriter fis=new FileWriter(f,true); 

	BufferedWriter bw=new BufferedWriter(fis);
bw.write("<html><body><title>This is bold news</title><p style=\"color:blue;text-align:center\">heyyy na magane</p></body></html>");
bw.close();
FileReader fiss=new FileReader(f);

BufferedReader br=new BufferedReader(fiss);
String line=null;
while((line=br.readLine())!=null) {
	System.out.println(line);
	
}
br.close();
fiss.close();
}
}
