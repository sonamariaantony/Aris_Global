package com;

import java.io.*;
public class Javaio {
public static void main(String arg[])
{
//java.io.File;
try
{
//byte[] b= {1,2,3,4,5,6,7};
String s="Hello Java";
byte[] b=s.getBytes();
OutputStream os=new FileOutputStream("C:\\Users\\00005797\\eclipse-workspace\\project1\\src\\com\\Javaio");
for(byte read:b)
{
os.write(read);
}
os.close();
InputStream is=new FileInputStream("C:\\Users\\00005797\\eclipse-workspace\\project1\\src\\com\\Javaio");
int size=is.available();
for(int i=0;i<size;i++)
{
System.out.print((char)is.read());
}
is.close();
}
catch(Exception e)
{
System.out.println("e "+e.getMessage());
}
}
}

