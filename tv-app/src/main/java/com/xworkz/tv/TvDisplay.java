package com.xworkz.tv;

public class TvDisplay {
	private String type;

	public TvDisplay(String type) {
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
		return "TvDisplay [type=" + type + "]";
	}
	
}
