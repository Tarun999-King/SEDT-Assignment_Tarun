package assignment4;
import java.util.*;
public class Valuecheck_in_hashmap {
	
	  
	
	  
	    // declaring the method to return
	    // if the value is present or not
	    // the parameter valueToBeChecked
	    // represents the value to be checked
	    boolean checkForValue(int valueToBeChecked)
	    {
	  
	        // initializing the HashMap
	        HashMap<String, Integer> hashMap = new HashMap<>();
	  
	        // filling the HashMap with
	        // key value pairs
	        hashMap.put("key1", 1);
	        hashMap.put("key2", 2);
	        hashMap.put("key3", 3);
	        hashMap.put("key4", 4);
	  
	        // declaring the variable to store
	        // the result
	        // calling the containsValue() method
	        boolean result
	            = hashMap.containsValue(valueToBeChecked);
	  
	        // returning the result
	        return result;
	    }
	  
	    // Driver Code
	    public static void main(String[] args)
	    {
	  
	        // instantiating the class
	    	Valuecheck_in_hashmap ob = new Valuecheck_in_hashmap();
	  
	        // displaying and calling the
	        // checkForValue() method
	        System.out.println(ob.checkForValue(10));
	        System.out.println(ob.checkForValue(1));
	    }
	}


