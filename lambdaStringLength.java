package java8;


interface simple1{
	 abstract String hello(String name);
	 }
public class lambdaStringLength {
  public static void main(String args[]) {
	simple1 s3=(String n)->"hello\t"+n+"\tGood mrng";
	String a=s3.hello("java");
	System.out.println(a);
	System.out.println(a.length());
}
}
