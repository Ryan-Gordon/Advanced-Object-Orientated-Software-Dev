package ie.gmit.sw;

public abstract class AbstractArtist implements Paintable{
	/**Class AbstractArtist implements Paintable class and implements their abstract methods
	 * 
	 * Methods: 
	 * public abstract void draw();
	 * public abstract void mixColours();
	 */
	
	//Override draw to simply call paint()
	@Override
	public void draw() {
		System.out.println(this.getClass().getName()+" draw()");
		paint();
	}
	@Override
	public void mixColours() {
		System.out.println(this.getClass().getName()+" mixColours()");
		
	}
	
	//Class study calls abstract class paint
	public void study() {
		System.out.println(this.getClass().getName()+" study()");
		paint();
	};
	
	//Abstract class called paint
	public abstract void paint();
	
	

}
