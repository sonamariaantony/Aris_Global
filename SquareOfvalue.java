package java8;
@FunctionalInterface
interface PrintNumber{
public void print(int num1);
}
public class SquareOfvalue {

	public static void main(String[] args) {
		PrintNumber p=n->
		System.out.println("square is" +n*n);
		p.print(5);
	}}

