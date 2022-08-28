package com.xworkz.running;

public class Running {
	String name;
	double avg;

	public Running(String name) {
		this.name = name;
		System.out.println("bean created");
	}

	public Running(String name, double avg) {
		this.name = name;
		this.avg = avg;
	}

}
