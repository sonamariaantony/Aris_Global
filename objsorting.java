package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class pen implements Comparable<pen>{
	
	private int price;
	private String brand;


public pen(int price, String brand) {
	this.price=price;
	this.brand=brand;
}

public String toString() {
	return "pen[price="+price+",brand="+brand+"]";
			}
public int compareTo(pen o) {
	if(this.price==o.price)
	{
		return 0;}
	else if(this.price>o.price)
	{
		return 0;
	}
	else if(this.price>o.price) {
		return 1;
	}
	else {
		return -1;
	}
}}



public class objsorting {

	public static void main(String[] args) {
		pen p1 =new pen(4 ,"A");
		pen p2 =new pen(9,"B");
		pen p3 =new pen(4 ,"c");
		
List<pen> pn =new ArrayList<pen>();
		
		pn.add(p1);
		pn.add(p2);
		pn.add(p3);
		
		ArrayList<pen> ls =new ArrayList<pen>();
		Collections.sort(pn,Collections.reverseOrder());
		System.out.println(pn);
		

	}}


