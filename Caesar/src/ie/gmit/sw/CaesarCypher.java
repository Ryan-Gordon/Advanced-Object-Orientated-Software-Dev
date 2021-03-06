package ie.gmit.sw;

public class CaesarCypher extends AbstractCypher {
	public CaesarCypher(int key) throws CypherException {
		super.setKey(new CypherKeyImpl(key));
	}
	public CaesarCypher(CypherKey key) throws CypherException {
		super.setKey(key);
	}
	
	protected byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException{
		
		byte[] temp = new byte[bytes.length];
		
		for (int i = 0; i < bytes.length; i++) {
			if(encrypt) {
				temp[i] = (byte) (bytes[i]+Byte.parseByte(getKey().toString()));
			}
			else{
				temp[i] = (byte) (bytes[i]-Byte.parseByte(getKey().toString()));
			}
			
		}
		return temp;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	
	
	//Inner private class implementing CypherKey interface
	private class CypherKeyImpl implements CypherKey{
		private int key;
		public  CypherKeyImpl(int key) {
			this.key = key;
		}
		
		
		
		@Override
		public void setKey(CypherKey key) throws CypherException {
			// TODO Auto-generated method stub
			
		}
		@Override
		public CypherKey getKey() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	

}
