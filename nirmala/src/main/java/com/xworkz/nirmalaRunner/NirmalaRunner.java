package com.xworkz.nirmalaRunner;

import java.time.LocalDate;

import com.xworkz.nirmalaDao.NirmalaDao;
import com.xworkz.nirmalaDao.NirmalaDaoImpl;
import com.xworkz.nirmalaEntity.NirmalaEntity;

public class NirmalaRunner {
public static void main(String []args) {
	NirmalaEntity nirmalaEntity=new NirmalaEntity(1, "btm", "male", "public", 5.00, 10.00, "Darrshan", LocalDate.now(), "Manoj", LocalDate.now());
	NirmalaDao nirmalaDao=new NirmalaDaoImpl();
	nirmalaDao.save(nirmalaEntity);
}
}
