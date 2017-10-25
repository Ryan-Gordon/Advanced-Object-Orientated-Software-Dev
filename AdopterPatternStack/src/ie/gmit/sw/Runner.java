package ie.gmit.sw;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String [] args) {
		
		Stackator<String> is = new CompositionStack<String>();
		
		
		
		for (int i = 0; i < 100; i++) {
			is.push("Element "+i);
		}
		
		while(!is.isEmpty()) {
			System.out.println(is.pop());	
		}
		
		
		ArrayList<String> ar = (ArrayList<String>) is ;
		
		
		
	}

}
