package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 


public class StreamDemo {

	public static void main(String[] args) {
	ArrayList<String> ar=new ArrayList<String>();
	ar.add("Sona");
	ar.add("Maria");
	ar.add("");
	ar.add("Antony");
	
	//uppercase
	List<String>ar1=ar.stream().map((stg)->stg.toUpperCase()).collect(Collectors.toList());
    ar1.forEach(System.out::println);
    System.out.println(ar1);
    
  //lowercase
    List<String>ar5=ar.stream().map((stg)->stg.toLowerCase()).collect(Collectors.toList());
    ar5.forEach(System.out::println);
  //concat
    String a="hello";
    List<String> ar2=ar1.stream().map((stg)->stg.concat(a)).collect(Collectors.toList());
    ar2.forEach(System.out::println);
    System.out.println("---------------------");
    
    //ends with specific char
	System.out.println("---------------------");
	System.out.println("character ends with a");
	List<Boolean> ar3=ar.stream().map((stg)->stg.endsWith("a")).collect(Collectors.toList());
	ar3.forEach(System.out::println);
	
	//to find even
    System.out.println("using filter to find even");
	List<Integer>list=Arrays.asList(1,12,5,10,9,2);
	list.stream().filter(c->c%2==0).forEach(System.out::println);
	System.out.println("---------------------");
	
	//starts with s
	System.out.println("character starts with s");
	List<Boolean> ar4=ar.stream().map((stg)->stg.startsWith("S")).collect(Collectors.toList());
	ar4.forEach(System.out::println);
	//specific char
	ar.stream().filter(b->b.contains("a")).forEach(System.out::println);
	//using filter count
			
			System.out.println("using filter to count a empty");
			long count=ar.stream().filter(s->s.isEmpty()).count();
			System.out.println(count);

    
	}

}
