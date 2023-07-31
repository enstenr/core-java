package day2;

import java.util.Stack;

public class JavaMemoryManagement {
	 static int i = 0;
	  
	    // Method to print numbers
	    public static int printNumber(int x)
	    { 
	        i = i + 1;
	        System.out.println(x);
	         
	        return  i+ printNumber(i );
	    }
	  
	    public static void main(String[] args)
	    {
	        // Recursive call without any
	        // terminating condition
	    	JavaMemoryManagement.printNumber(i);
	    	
	    }

}
