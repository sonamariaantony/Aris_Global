package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class DemoList {

	public static void main(String[] args) {
		//ArrayList<String> ls= new ArrayList<String>();
		//List<String> ls= new LinkedList<String>();
		//List<String> ls= new Vector<String>();
		List<String> ls= new ArrayList<String>();
		
		ls.add("ravi");
		ls.add("ajay");
		ls.add("priya");
        ls.size();
		System.out.println(ls.get(0));
		Collections.sort(ls);;
		System.out.println(ls);
		
	LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(5);
		ll.add(10);
		ll.add(5100);
	System.out.println(ls);
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(10);
		v.add(5100);
	System.out.println(v);
	
	Stack<Integer> stack=new Stack<Integer>();
	stack.push(1);
	stack.push(100);
	stack.push(5);
	System.out.println(stack.pop());
	
}}


