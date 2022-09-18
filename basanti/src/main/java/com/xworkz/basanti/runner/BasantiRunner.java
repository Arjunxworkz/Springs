package com.xworkz.basanti.runner;

import java.time.LocalDate;
import java.util.Date;

import com.xworkz.basanti.dao.BasantiDAO;
import com.xworkz.basanti.dao.BasantiDaoImpl;
import com.xworkz.basanti.entity.BasantiEntity;

public class BasantiRunner {

	public static void main(String[] args) {
		
		BasantiEntity basantiEntity=new BasantiEntity(6, "btm", "address", 5.5d, 2.2d, "ravi kumar",LocalDate.now(), "manju", LocalDate.now());
        System.out.println(basantiEntity);
        BasantiDAO basantiDAO=new BasantiDaoImpl(basantiEntity);
        basantiDAO.save(basantiEntity);
	}

}
