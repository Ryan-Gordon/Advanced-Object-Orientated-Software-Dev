package ie.gmit.sw;

import java.util.*;

public class TypeA {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		
		System.runFinalizersOnExit(true); //Forces the objects out of scope by calling finalize so they get GC'd
		
		/**
		 * This method Instantiates a object of Type A within this Type A and passes the date to C
		 * Bad as this create a TypeB in A AND C
		 */
		//TypeC tc = new TypeC(new TypeB(new Date(), "TypeB that is in A passing date to C").getDate(), "TypeC that is in A passing date to C"); //One way to do this with constructor
		
		/**
		 * TypeB is instantiated in Type C so we can just pass in a date
		 */
		TypeC tc = new TypeC(new Date(),"in A passing date to C which will set it in TypeB"); //One way to do this with constructor

		
		//Instantiate 100 instances of TypeD
		for (int i = 0; i < 100; i ++){
			tc.add(new TypeD("G" + i));
		}
		
		System.out.println("Count: " + tc.count());
		
		/**
		 * Create another instance of TypeD
		 * This object is NOT in the list but we use to find a TypeD object in the list and remove it.
		 */
		TypeD td = new TypeD("G50"); 
		boolean result = tc.remove(td); //Proves that full encapsulation works.
		
		System.out.println("Remove returned " + result + ". There are " + tc.count() + " elements in container.");
		
		List<TypeD> tds = tc.elements(); //The List returned by elements() is a copy containing clones
		tds.clear(); //Clears the copy and the clones, but leaves the integrity of TypeC intact

		
		System.out.println("Count: " + tc.count()); //Proof: there are still 99 elements in TypeC
		
		
		/*
		TypeD d = new TypeD("giggity");
		c.add(new TypeD("hello"));
		
		c.add(new TypeD("hello2"));
		
		c.count();
		
		d.setName("giggity2");
		c.add(d);
		System.out.println(c.elements().toString());
		System.out.println(c.contains(d));
		c.delete(d);
		System.out.println(c.contains(d));
		
		*/
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Type B about to be GC"+this);
	}

}
