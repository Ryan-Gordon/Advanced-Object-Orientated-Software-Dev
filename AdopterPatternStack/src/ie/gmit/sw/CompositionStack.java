package ie.gmit.sw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CompositionStack<E> implements Stackator<E> {
	private List<E> list = null;
	public CompositionStack() {
		
		double random =Math.random();
		if(random > 0.7d) {
		 list = new Vector<E>();
		}
		else if (random > 0.35d){
			list = new LinkedList<E>();
		}
		else {
			list = new ArrayList<E>();
		}
	}

	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#peek()
	 */
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#peek()
	 */
	@Override
	public E peek() {
		return list.get(list.size() - 1);
	}
	
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#pop()
	 */

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#pop()
	 */
	@Override
	public E pop() {
		E element = peek(); //Peek to get end element
		list.remove(list.size() -1); // remove the element
		return element;
	}
	
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#push(E)
	 */

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#push(E)
	 */
	@Override
	public void push(E element) {
		list.add(element);
	}


	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#size()
	 */

	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#size()
	 */
	@Override
	public int size() {
		return list.size();
	}


	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#isEmpty()
	 */
	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Stackator#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
