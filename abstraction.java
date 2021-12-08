package com;


abstract class car{
	abstract void accelerate();
}
class suzuki extends car{
	void accelerate()
	{
		System.out.println("suzuki : accelerate");
	}
	
}

public class abstraction {

	public static void main(String[] args) {
		car obj=new suzuki();
		obj.accelerate();}

}
