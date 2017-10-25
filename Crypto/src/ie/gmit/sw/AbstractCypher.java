package ie.gmit.sw;

import java.security.Key;

import javax.crypto.Cipher;

public abstract class AbstractCypher implements Cypher{

	private Cipher cypher;

	public AbstractCypher() {
		super();
	}

	public byte[] encrypt(byte[] plaintext, Key k) throws Throwable {
		//Init the cypher with the public key 
		getCypher().init(Cipher.ENCRYPT_MODE, k);
		
		//return an encrypted versoin of the plaintext
		return getCypher().doFinal(plaintext);	
	}

	public byte[] decrypt(byte[] cyphertext, Key k) throws Throwable {
		//Init the cypher with the private key 
		getCypher().init(Cipher.DECRYPT_MODE, k);
		
		//return an encrypted version of the plaintext
		return getCypher().doFinal(cyphertext);	
	}

	protected final Cipher getCypher() {
		return cypher;
	}

	protected final void setCypher(Cipher cypher) {
		this.cypher = cypher;
	}

	/*
	@Override
	public String encrypt(String plaintext, Key key) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decrypt(String cypherText, Key key) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	*/

	
	public abstract byte[] encrypt(byte[] plaintext) throws Throwable;
	
	public abstract byte[] decrypt(byte[] cypherText) throws Throwable;
		
	

}