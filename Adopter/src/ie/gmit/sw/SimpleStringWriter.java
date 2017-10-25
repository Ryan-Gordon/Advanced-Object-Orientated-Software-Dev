package ie.gmit.sw;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleStringWriter {
	
	private FileWriter fw;
	public void open(String fileName){ 
		try{
		fw = new FileWriter(fileName); 
		}
		catch(IOException ioe){
		ioe.printStackTrace(); 
		}
	}
	public void write(String s){ 
		try{
			
			fw.write(s + "\n"); 
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	public void close(){
	 
		try{ 
			 fw.close();
		}
		catch(IOException ioe){ 
			ioe.printStackTrace();
		} 
	}
	


}
