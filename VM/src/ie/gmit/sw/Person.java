package ie.gmit.sw;

public class Person {
	private int id;
	
	//Constructor using the id param
	public Person(int id) {
		super();
		this.id = id;
	}
	//Getters Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Override

	@Override
	public String toString() {
		return this + " id="+this.id ;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(toString() + " about to be GC'd.");
	}
	
	
}
