package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Stud implements Comparable<Stud>
{
	private int roll;
	private String name;
	private int age;
	
	public Stud(int roll, String name, int age) {
		this.roll=roll;
		this.name=name;
		this.age=age;
	}		 
public String toString() {
	return "Student[roll="+roll+",name="+ name+ ",age+" +age +"]\n";
}
@Override
public int compareTo(Stud o) {
	if(this.roll==o.roll)
	{
		return 0;}
	else if(this.roll>o.roll)
	{
		return 0;
	}
	else if(this.roll>o.roll) {
		return 1;
	}
	else {
		return -1;
	}
}}
		
class ObjectSorting {

	public static void main(String[] args)
	{
		Stud s1=new Stud(1,"sona",22);
		Stud s2=new Stud(2,"maria",14);
		Stud s3=new Stud(1,"Antony",54);
		
		List<Stud> studentList =new ArrayList<Stud>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		ArrayList<Stud> ls =new ArrayList<Stud>();
		Collections.sort(studentList,Collections.reverseOrder());
		System.out.println(studentList);
		
	}
	}
		

	


