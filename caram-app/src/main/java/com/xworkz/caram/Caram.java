package com.xworkz.caram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Caram {

private String caramName;


private String brand;

private int bclackGoti;

private int whiteWhite;
@Autowired
BlackBoll blackBoll;
@Autowired
WhiteBoll whiteboll;

public Caram() {
System.out.println("default constuctor of caram class");	
}

public String getCaramName() {
	return caramName;
}
@Value("Cheer")	
public void setCaramName(String caramName) {
	this.caramName = caramName;
}

public String getBrand() {
	return brand;
}
@Value("Akki")
public void setBrand(String brand) {
	this.brand = brand;
}

public int getBclackGoti() {
	return bclackGoti;
}
@Value("7")
public void setBclackGoti(int bclackGoti) {
	this.bclackGoti = bclackGoti;
}

public int getWhiteWhite() {
	return whiteWhite;
}
@Value("7")
public void setWhiteWhite(int whiteWhite) {
	this.whiteWhite = whiteWhite;
}

public BlackBoll getBlackBoll() {
	return blackBoll;
}

public void setBlackBoll(BlackBoll blackBoll) {
	this.blackBoll = blackBoll;
}

public WhiteBoll getWhiteboll() {
	return whiteboll;
}

public void setWhiteboll(WhiteBoll whiteboll) {
	this.whiteboll = whiteboll;
}

@Override
public String toString() {
	return "Caram [caramName=" + caramName + ", brand=" + brand + ", bclackGoti=" + bclackGoti + ", whiteWhite="
			+ whiteWhite + ", blackBoll=" + blackBoll + ", whiteboll=" + whiteboll + "]";
}


}
