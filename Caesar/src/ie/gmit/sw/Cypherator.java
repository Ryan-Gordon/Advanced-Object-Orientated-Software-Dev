package ie.gmit.sw;

public interface Cypherator {

	String encrypt(String plaintext) throws CypherException;

	byte[] encrypt(byte[] plaintext) throws CypherException;

	String decrypt(String cypherText) throws CypherException;

	byte[] decrypt(byte[] cypherText) throws CypherException;

}