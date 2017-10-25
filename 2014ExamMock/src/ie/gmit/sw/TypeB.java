package ie.gmit.sw;

import java.util.Date;

public class TypeB {
	private Date date;
	private String ss="";
	public TypeB(Date date, String s) {
		super();
		this.date = date;
		ss = s;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Type B about to be GC"+this+ss);
	}
	
}
