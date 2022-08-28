package com.xworkz.test;

public class Best_Friend {
	// Member attributes of this class
	String name;
	int age;
	String college;
	String course;
	String address;

	// Constructor of this class
	Best_Friend(String name, int age, String college, String course, String address) {
		// This keyword refers to current instance itself
		this.name = name;
		this.age = age;
		this.college = college;
		this.course = course;
		this.address = address;
	}

	// Method 1
	// Creating our own toString() method
//	public String toString() {
//		return name + " " + age + " " + college + " " + course + " " + address;
//	}

	@Override
	public String toString() {
		return "Best_Friend [name=" + name + ", age=" + age + ", college=" + college + ", course=" + course
				+ ", address=" + address + "]";
	}

	// Method 2
	// Main driver method
	public static void main(String[] args) {
		// Creating object of class inside main() method
		Best_Friend b = new Best_Friend("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu");
		Best_Friend b1 = new Best_Friend("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu");
        if(b.equals( b1)) {
        	System.out.println("ref b and b1 is same "+b);
        }
        else {
        	System.out.println("ref is b not equal b1 :"+b1);
        }
		// Print and display commands to illustrate
		// toString() method as both will print the same
		// Print the object
		

		// Printing object but using toString() method
		// System.out.println(b.toString());
	}
}
