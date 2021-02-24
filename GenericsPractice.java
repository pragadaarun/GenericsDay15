
import java.util.ArrayList;

public class GenericsPractice {
	
	 public static <T extends Comparable<T>> void findmax(T[] element)
     {
    	 T max = element[0];
    	 for(T i : element) {
    		 if(i.compareTo(max) > 0) 
    		 {
    			 max=i;
    		 }
    	 }
    	 System.out.println("Maximum value in array is "+max);
    	 
     }
	 
	 public static <T extends Comparable<T>> void findmaxString(T[] element)
     {
    	 T max = element[0];
    	 int maxLength=element[0].toString().length();
    	 for(T i : element) {
    		 if(i.compareTo(max) > maxLength) 
    		 {
    			 max=i;
    			 maxLength=((String) element[(int) i]).length();
    		 }
    	 }
    	 System.out.println(maxLength);
    	 System.out.println("the maximum value in array is "+max);
    	 
     }

	 public static <E> void printArray(E[] element )
	 {
		for(E i :element)
		 {
			 System.out.println(i+ " ");
			 System.out.println();
		 }
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer[] intArray = {1,5,19,97,5};
		 Float[]   floatArray = {0f,1f,2f,3f,9f};
	     Double[]  doubleArray = {1.1,1.2,3.1,8.8,9.4,7.0};
	     String[]  stringArray = {"JohnWick","FantasticFour","Xmen","Avengers"};
	   
	    
	    printArray(intArray);
	    printArray(floatArray);
	    printArray(doubleArray);
	    printArray(stringArray);
	    
	    
	   findmax(intArray);
	   findmax(floatArray);
	   findmax(doubleArray);
	   findmaxString(stringArray);
	   
       
	}

}