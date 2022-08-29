package com.xworkz.tv;

public class TvStand {
	private String type;

	public TvStand(String type) {
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
		return "TvStand [type=" + type + "]";
	}
	
	
}
