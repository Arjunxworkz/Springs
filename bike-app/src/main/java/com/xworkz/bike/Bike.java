package com.xworkz.bike;

import org.springframework.stereotype.Component;

@Component
public class Bike {
private String companyName;
private String ownerName;
private String bikeNumber;
private double avg;
private Hero hero;
private Tvs tvs;
private Bajaj bajaj;

public Bike() {
	System.out.println("Bean Created");
}

public Bike(String companyName, String ownerName, String bikeNumber, double avg, Hero hero, Tvs tvs, Bajaj bajaj) {
	//super();
	this.companyName = companyName;
	this.ownerName = ownerName;
	this.bikeNumber = bikeNumber;
	this.avg = avg;
	this.hero = hero;
	this.tvs = tvs;
	this.bajaj = bajaj;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getOwnerName() {
	return ownerName;
}

public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public String getBikeNumber() {
	return bikeNumber;
}

public void setBikeNumber(String bikeNumber) {
	this.bikeNumber = bikeNumber;
}

public double getAvg() {
	return avg;
}

public void setAvg(double avg) {
	this.avg = avg;
}

public Hero getHero() {
	return hero;
}

public void setHero(Hero hero) {
	this.hero = hero;
}

public Tvs getTvs() {
	return tvs;
}

public void setTvs(Tvs tvs) {
	this.tvs = tvs;
}

public Bajaj getBajaj() {
	return bajaj;
}

public void setBajaj(Bajaj bajaj) {
	this.bajaj = bajaj;
}

@Override
public String toString() {
	return "Bike [companyName=" + companyName + ", ownerName=" + ownerName + ", bikeNumber=" + bikeNumber + ", avg="
			+ avg + ", hero=" + hero + ", tvs=" + tvs + ", bajaj=" + bajaj + "]";
}

}
