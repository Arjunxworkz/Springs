package com.xworkz.bike;

import org.springframework.stereotype.Component;

@Component
public class Tvs {
private String name;

public Tvs() {
	System.out.println("Bean Created");
}
public Tvs(String name) {
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
	return "Tvs [name=" + name + "]";
}
}
