package Week3Day4Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		//int[] num= {3,2,11,4,6,7};
		
		List<Integer> largest=new ArrayList<Integer>();
		
		largest.add(3);
		largest.add(2);
		largest.add(11);
		largest.add(4);
		largest.add(6);
		largest.add(7);
		
	     Collections.sort(largest);
	     System.out.println(largest);
	     //return second highetemst number from sorted ArrayList
	     temp=largest.get(largest.size()-2);
	     System.out.println("Second highest number");
	     System.out.println(temp);
		

	}

}
