package com.xworkz.bike;

import org.springframework.stereotype.Component;

@Component
public class Hero {
private String name ;


public Hero() {
	System.out.println("Bean Created");
}
public Hero(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Hero [name=" + name + "]";
}


}
