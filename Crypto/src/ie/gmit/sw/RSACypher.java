package ie.gmit.sw;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.*; //Import Java Crypto library
public class RSACypher extends AbstractCypher {
	
	//Define a KeyPair object 
	KeyPair keyring;
	
	
	
	public RSACypher() throws Exception {
		//Get an instance of the RSA KeyPairGenerator - We dont create we get
		KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
		keygen.initialize(512); // Initialize the bit size 
		keyring = keygen.generateKeyPair(); // generate a new keypair 
		setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.getClass().getName()+ "=" + this);
	}

	@Override
	public byte[] encrypt(byte[] plaintext) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
