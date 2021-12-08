package java8;

	import java.util.*; 

	import java.util.stream.Collectors; 

	  

	class GFG { 

	  

	    // Driver code 

	    public static void main(String[] args) 

	    { 

	  

	        System.out.println("The stream after applying "

	                           + "the function is : "); 

	  

	        // Creating a list of Integers 

	        List<String> list = Arrays.asList("geeks", "gfg", "g", 

	                                          "e", "e", "k", "s"); 

	  

	        // Using Stream map(Function mapper) to 

	        // convert the Strings in stream to 

	        // UpperCase form 

	        List<String> answer = list.stream().map(String::toUpperCase). 

	        collect(Collectors.toList()); 

	  

	        // displaying the new stream of UpperCase Strings 

	        System.out.println(answer); 

	    } 
	}


