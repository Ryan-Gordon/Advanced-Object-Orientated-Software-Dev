package ie.gmit.sw;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class AESCypher extends AbstractCypher{
	private Key key;
	
	
	public AESCypher()  throws Exception{
		
		KeyGenerator keyGen = KeyGenerator.getInstance("AES"); 
		keyGen.init(128);
		key = keyGen.generateKey();
		super.setCypher( Cipher.getInstance("AES/ECB/PKCS5Padding"));
		}


	/* (non-Javadoc)
	 * @see ie.gmit.sw.AbstractCypher#encrypt(byte[], java.security.Key)
	 */
	@Override
	public byte[] encrypt(byte[] plaintext) throws Throwable {
		return super.encrypt(plaintext, key);
	}


	/* (non-Javadoc)
	 * @see ie.gmit.sw.AbstractCypher#decrypt(byte[], java.security.Key)
	 */
	@Override
	public byte[] decrypt(byte[] cyphertext) throws Throwable {
		return super.decrypt(cyphertext, key);
	}
	
}
