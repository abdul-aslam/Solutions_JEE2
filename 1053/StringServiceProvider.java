package com.htc.javaex3;

import java.io.Serializable;

public class StringServiceProvider implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String stringvar;
		
	public StringServiceProvider(String stringvar) {
		super();
		this.stringvar = stringvar;
	}
	public StringServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStringvar() {
		return stringvar;
	}
		public void setStringvar(String stringvar) {
		this.stringvar = stringvar;
	}
	
	public String revStringvar() {
		return new StringBuffer(this.stringvar).reverse().toString();	
	}
	
	public boolean srchStringvar(CharSequence substr) {
	return this.stringvar.contains(substr);
			
	}
	
	public String repStringvar(CharSequence substr1,CharSequence substr2) {
		return this.stringvar.replace(substr1, substr2);
				
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stringvar == null) ? 0 : stringvar.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringServiceProvider other = (StringServiceProvider) obj;
		if (stringvar == null) {
			if (other.stringvar != null)
				return false;
		} else if (!stringvar.equals(other.stringvar))
			return false;
		return true;
	}
	

}
