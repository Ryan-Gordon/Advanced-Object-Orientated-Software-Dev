package ie.gmit.sw;

public class ArrayStringWriter extends SimpleStringWriter implements ListWriterable{

	@Override
	public void write(String[] list) {
		// TODO Auto-generated method stub
		for(String s: list) {
			super.write(s);
		}
	}

}
