package ie.gmit.sw;


import java.util.*;

public class TypeC {
	
	private List<TypeD> list = new ArrayList<TypeD>();

	/**
	 * In this method we instantiate a instance of type b which is held by C
	 * When C is instaniated it takes a param of Date which is passed to B's set date method
	 * When C is GC's B is also this is stronger than an association
	 */
	private TypeB tb = new TypeB(new Date(), "TypeB that is in C which creates TypeB with newDate()");
	private String ss = "0";
	
	/**
	 * Constructor for TypeC
	 * Takes a date param and passes it to Type B's setdate
	 * @param d
	 */
	public TypeC(Date d, String s) {
		tb.setDate(d);
		ss = s;
	}
	
	public void add(TypeD d) {
		list.add(d);
	}
	public boolean remove(TypeD d) {
		
		return list.remove(d);
	}
	
	public int count() {
		return list.size();
	}
	
	public boolean contains(TypeD d) {
		return list.contains(d);
	}
	
	public List<TypeD> elements(){ //Note: both the List and TypeD object have a "black diamond" relationship with TypeC
		List<TypeD> temp = new ArrayList<TypeD>(); //Require a new List with new elements to preserve encapsulation
		for (TypeD element: list){
			try {
				TypeD td = (TypeD) element.clone(); //Also need to clone() each element to preserve encapsulation
				temp.add(td);
			} catch (CloneNotSupportedException e) {
				//Ignore
			}			
		}
		
		return temp;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Type C about to be GC :"+this+" with the ss of "+ss);
	}
}
