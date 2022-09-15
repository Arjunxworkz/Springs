package com.xworkz.casino.dao;

public class CasinoDaoImpl implements CasinoDAO {

	String[] datStore = new String[5];
	private int index=0;

	@Override
	public boolean save(String name) {
		//System.out.println("save started");
		datStore[index]=name;
		System.out.println(index+ " "+name );
		this.index++;
		return true;
	}

}
