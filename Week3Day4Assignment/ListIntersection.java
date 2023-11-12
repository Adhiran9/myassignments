package Week3Day4Assignment;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};

		ArrayList<Integer> intersection = intersection(arr1,arr2);
		System.out.println(intersection);
	}


		private static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
		
		ArrayList<Integer> value = new ArrayList<>();
		
		int i=0,j=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]==arr2[j]) {
				value.add(arr1[i]);
				i++;
				j++;
			}
			
			else if(arr1[i]<arr2[j]){
				i++;
			}
			else {
				j++;
			}
		}
		return value;
	
		
	}
		
}
