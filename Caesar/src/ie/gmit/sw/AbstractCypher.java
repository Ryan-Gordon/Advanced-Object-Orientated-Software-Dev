package ie.gmit.sw;



public abstract class AbstractCypher implements CypherKey, Cypherator{

	private CypherKey key;

	public AbstractCypher() {
		super();
	}

	public void setKey(CypherKey key) throws CypherException {
		this.key = key;
	}

	public CypherKey getKey() {
	
		
		return this.key;
	}

	public String encrypt(String plaintext) throws CypherException {
		return new String(encrypt(plaintext.getBytes()));
	}

	public byte[] encrypt(byte[] plaintext) throws CypherException {
		return doCypher(plaintext, true);
	}

	public String decrypt(String cypherText) throws CypherException {
		return new String(decrypt(cypherText.getBytes()));	
	}

	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return doCypher(cypherText, false);
	}
	
	protected abstract byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException;

}