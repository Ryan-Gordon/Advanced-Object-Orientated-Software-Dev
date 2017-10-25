package ie.gmit.sw;

public class CompArrayStringWriter extends SimpleStringWriter implements ListWriterable{
	//Compose and Delegate the SimpleStringWriter; which is an adapter for FileWriter
	private SimpleStringWriter ssw = new SimpleStringWriter();
	@Override
	public void write(String[] list) {
		// TODO Auto-generated method stub
		for(String s: list) {
			super.write(s);
		}
	}
	public void open(String fileName) {
		ssw.open(fileName);
	}
	public void close() {
		ssw.close();
	}
	
	
}
