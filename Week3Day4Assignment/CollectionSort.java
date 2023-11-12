package Week3Day4Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {


		List<String> comp=new ArrayList<String>();
		comp.add("HCL");
		comp.add("Wipro");
		comp.add("Aspire systems");
		comp.add("CTS");
		
		System.out.println(comp);
		Collections.sort(comp);
		System.out.println("\nSorted before reversing");
		System.out.println(comp);

		Collections.reverse(comp);
		System.out.println("\nAfter reversing the list of companies");
		System.out.println(comp);
		

	}

}
