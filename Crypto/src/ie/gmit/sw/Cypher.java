package ie.gmit.sw;

import java.security.Key;

public interface Cypher{
	
	byte[] encrypt(byte[] plaintext) throws Throwable;

	byte[] decrypt(byte[] cypherText) throws Throwable;
	
	

}
