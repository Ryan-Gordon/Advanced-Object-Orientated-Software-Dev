package ie.gmit.sw;

public interface Stackator<E> {

	E peek();

	E pop();

	void push(E element);

	int size();

	boolean isEmpty();

}