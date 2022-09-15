package com.xworkz.phone;

public class PhoneEntity {
String phoneName;
double PhonePrice;
String phoneOwnerName;

public PhoneEntity() {
	
}

public PhoneEntity(String phoneName, double phonePrice, String phoneOwnerName) {
	//super();
	this.phoneName = phoneName;
	PhonePrice = phonePrice;
	this.phoneOwnerName = phoneOwnerName;
}

public String getPhoneName() {
	return phoneName;
}

public void setPhoneName(String phoneName) {
	this.phoneName = phoneName;
}

public double getPhonePrice() {
	return PhonePrice;
}

public void setPhonePrice(double phonePrice) {
	PhonePrice = phonePrice;
}

public String getPhoneOwnerName() {
	return phoneOwnerName;
}

public void setPhoneOwnerName(String phoneOwnerName) {
	this.phoneOwnerName = phoneOwnerName;
}

@Override
public String toString() {
	return "PhoneEntity [phoneName=" + phoneName + ", PhonePrice=" + PhonePrice + ", phoneOwnerName=" + phoneOwnerName
			+ "]";
}




}
