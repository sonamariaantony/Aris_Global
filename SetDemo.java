package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	HashSet<Integer> hash = new HashSet<>();
	hash.add(100);
	hash.add(5);
	hash.add(10);
	System.out.println(hash);
	
	
	LinkedHashSet<Integer> hs = new LinkedHashSet<>();
	hs.add(100);
	hs.add(5);
	hs.add(10);
	System.out.println(hs);
	
	
	PriorityQueue<Integer> pq = new PriorityQueue <>();
	pq.add(100);
	pq.add(5);
	pq.add(10);
	System.out.println(pq);
	System.out.println(pq.poll());
	
	TreeSet<Integer> ts= new TreeSet<Integer>();
	ts.add(100);
	ts.add(5);
	ts.add(10);
	System.out.println(ts);
	
	
	}

}
