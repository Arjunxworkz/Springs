package com.xworkz.its_a_snook;

public class SnookerGame {
	String onwerName;
	String location;
	int totalTable;
	double chargesPerHours;
private	int noOfWorker;
private	boolean allDetials;

	SnookerGame(String onwerName,String location,int totalTable,double chargesPerHours) {
		this.onwerName=onwerName;
		this.location=location;
		this.totalTable=totalTable;
		this.chargesPerHours=chargesPerHours;
	}

	public int getNoOfWorker() {
		return noOfWorker;
	}

	public void setNoOfWorker(int noOfWorker) {
		this.noOfWorker = noOfWorker;
	}

	public boolean getAllDetials() {
		return allDetials;
	}

	public void setAllDetials(boolean allDetials) {
		this.allDetials = allDetials;
	}
	


}