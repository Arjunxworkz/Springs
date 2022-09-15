package com.xworkz.casino.runner;

import com.xworkz.casino.dao.CasinoDAO;
import com.xworkz.casino.dao.CasinoDaoImpl;

public class CasinoRunner {

	public static void main(String[] args) {
	CasinoDAO casinoDAO=new CasinoDaoImpl();
	casinoDAO.save("ravi");
	casinoDAO.save("ram");
	casinoDAO.save("kareem");

	}

}
