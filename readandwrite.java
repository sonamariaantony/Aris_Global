package com;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readandwrite {

	public static void main(String[] args) {
try {
	FileReader fr=new FileReader("readandwriteInput.txt");
	FileWriter fw=new FileWriter("readandwriteOutput.txt");
	String str=" ";
	int i;
	while((i=fr.read())!=-1) {
		str +=(char)i;
	}
	System.out.println(str);
	fw.write(str);
	fr.close();
	fw.close();
	System.out.println("file readinh and writngn both done");
	
}
catch(IOException e) {
	System.out.println("there are IOException");
	
}

	}

}
