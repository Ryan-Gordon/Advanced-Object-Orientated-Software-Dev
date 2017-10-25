package ie.gmit.sw;

public class CypherFactory {
	//2 Design patterns
	
	//Factory is for creation of objects
	
	//singleton - guaranteeing their is only 1 instance of an object by making constructor private
	//Eager singleton
	
	private static CypherFactory fact = new CypherFactory();
	
	//Singleton design pattern. Private constructor called within the class.
	private CypherFactory() {
		
		
	}
	
	public static CypherFactory getInstance() { //Singleton method 
		return fact;
	}
	
	public Cypher getCypher(CypherType type) throws Exception {
		if(type == CypherType.Symmetric) {
			return new AESCypher();
		}else {
			
		
		
		return null;
		}
	}

}
