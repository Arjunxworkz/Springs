package com.xworkz.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.sumsung.Sumsung;

//@Component
public class Mobile {
	
	@Value("${name}")
	String name;
	@Value("true")
	boolean iphone;
	@Value("4")
	int size;
	
	@Autowired
	Sumsung sumsung;
	 
	public Mobile() {
	System.out.println(this.getClass().getSimpleName());
	}
	
	public Mobile(String name, boolean iphone, int size ,	Sumsung sumsung ) {
		//super();
		this.name = name;
		this.iphone = iphone;
		this.size = size;
		this.sumsung=sumsung;
		
	}
	
	//g

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIphone() {
		return iphone;
	}

	public void setIphone(boolean iphone) {
		this.iphone = iphone;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Sumsung getSumsung() {
		return sumsung;
	}

	public void setSumsung(Sumsung sumsung) {
		this.sumsung = sumsung;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", iphone=" + iphone + ", size=" + size + ", sumsung=" + sumsung + "]";
	}


	

}
