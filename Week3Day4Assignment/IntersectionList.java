package Week3Day4Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[] = {2, 3, 4, 5, 6};
	     int arr2[] = {4, 6, 7, 8, 9};
	     
	     //Declare hashset   
	     List<Integer> set1 = new ArrayList<Integer>();	
	     
	     for(int val:arr1) {
	    	 set1.add(val);
	     }
	     
	     for(int val:arr2) {
	    	 if(set1.contains(val)) {
	    		 System.out.println(val);
	    	 }
	     }

	}

}
