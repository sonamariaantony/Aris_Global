package com;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {

	public static void main(String[] args) {
		//Map<Integer,String> map= new HashMap<>();
		//Map<Integer, String> map=new LinkedHashMap<>();
		Map<Integer, String> map=new TreeMap<>();
		map.put(100,"raj");
		map.put(2,"sona");
		map.put(8,"maria");
		map.put(23,"antony");
		//map.remove(1);
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.get(8));
		System.out.println(map.containsValue("2"));
		
	Map<Integer,String> map2= new HashMap<>();
	map2.putAll(map);
	System.out.println(map2);
	}}
