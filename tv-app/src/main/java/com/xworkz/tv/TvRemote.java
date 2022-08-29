package com.xworkz.tv;

public class TvRemote {
	private String type;

	public TvRemote(String type) {
		//super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TvRemote [type=" + type + "]";
	}
	
	
}
