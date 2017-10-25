package ie.gmit.sw;
import java.util.*;

public class Runner {
	
	
	public static void main(String[] args) throws Throwable {
		//Main method 
		
		List<Person> people = new ArrayList<>();
		
		int num = System.in.read();
		Person p = null;
		for(int i = 0; i< 1000000000; i++ ) {
			p = new Person(i);
			
			if(i % 100 == 0) people.add(p);
		}
	}
}
