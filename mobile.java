package com;

class mobiledetails{
	private String name;
	private String makeacall;
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getmakeacall()
	{
		return makeacall;
	}
	public void setmakeacall(String makeacall)
	{
		this.makeacall=makeacall;
	}
	
	}
	
public class mobile {
public static void main(String[] args) {
	mobiledetails md = new mobiledetails();
	md.setname("nokia");
	md.setmakeacall("12334");
	
	System.out.println("name:"+ md.getname());
	System.out.println("makeacall:"+ md.getmakeacall());

}}