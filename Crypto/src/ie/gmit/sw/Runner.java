package ie.gmit.sw;

public class Runner {
	
	public static void main(String[] args) throws Throwable {
		CypherFactory cf = CypherFactory.getInstance();
		Cypher c = cf.getCypher(CypherType.Symmetric);
		
		String message = "The quick brown fox jumps";
		byte[] result = c.encrypt(message.getBytes());
		System.out.println(new String(result)); //Encrypting the string
		System.out.println(new String(c.decrypt(result))); //Decrypting 
	}

}
