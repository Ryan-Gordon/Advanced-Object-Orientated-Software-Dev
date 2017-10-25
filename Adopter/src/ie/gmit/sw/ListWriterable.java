package ie.gmit.sw;

public interface ListWriterable {

	
	public void open(String filename);
	public void write(String[] list);
	public void close ();
	
	
}
