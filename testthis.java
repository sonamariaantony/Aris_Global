package com;
class student
{
	int rollno;
	String name;
	float fee;
	student(int rollno,String name, float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;}
	void display()
	{
		System.out.println(this.rollno+" "+this.name+" "+this.fee);
		
	}
}
public class testthis {

	public static void main(String[] args) {
	student s1=new student(111,"ankit",5000f);
	student s2=new student(112,"sumt",6000f);
	s1.display();
	s2.display();}}
	