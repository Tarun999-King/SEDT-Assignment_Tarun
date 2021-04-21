package assignment4;

import java.util.ArrayList;

public class Arraylist_Reverse {
	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        // Arraylist for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
  
            // Append the elements in reverse order
            revArrayList.add(alist.get(i));
        }
  
        // Return the reversed arraylist
        return revArrayList;
    }
	
	    public static void main(String[] args)
	    {
	    	Arraylist_Reverse obj = new Arraylist_Reverse();
	  
	        // Declaring arraylist without any initial size
	        ArrayList<Integer> arrayli = new ArrayList<Integer>();
	  
	        // Appending elements at the end of the list
	        arrayli.add(new Integer(1));
	        arrayli.add(new Integer(2));
	        arrayli.add(new Integer(3));
	        arrayli.add(new Integer(4));
	        
	        arrayli = obj.reverseArrayList(arrayli);
	        System.out.print("\nElements after reversing:");
	        System.out.println(arrayli);
	       // obj.printElements(arrayli);
	    }
	}


