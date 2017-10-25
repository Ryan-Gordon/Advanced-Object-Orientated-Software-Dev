package ie.gmit.sw;

public class DefaultHobbyist implements Hobbyable{
	

	public void mixColours() {
		System.out.println(this.getClass().getName()+" mixColours()");
	}

	
	public void draw() {
		System.out.println(this.getClass().getName()+" draw()");	
	}

	
	public void doHobby() {
		System.out.println(this.getClass().getName()+" doHobby()");	
	}

	
	public void shoot() {
		System.out.println(this.getClass().getName()+" shoot()");	
	}

}
