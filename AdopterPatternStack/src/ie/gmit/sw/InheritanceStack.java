package ie.gmit.sw;

import java.util.ArrayList;

public class InheritanceStack<E> extends ArrayList<E>  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 777L;

	
	public E peek() {
		return get(size() - 1);
	}
	
	
	public E pop() {
		E element = peek(); //Peek to get end element
		remove(size() -1); // remove the element
		return element;
	}
	
	
	public void push(E element) {
		add(element);
	}
			
}
