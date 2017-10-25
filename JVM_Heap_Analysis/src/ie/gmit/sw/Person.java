package ie.gmit.sw;

public class Person {
	private int test;

	public Person(int test) {
		super();
		this.test = test;
	}

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
