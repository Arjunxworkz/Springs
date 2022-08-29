package com.xworkz.tv;

public class TvSetupBox {
	private String companyName;

	public TvSetupBox(String companyName) {
		//super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "TvSetupBox [companyName=" + companyName + "]";
	}
	
	
}
