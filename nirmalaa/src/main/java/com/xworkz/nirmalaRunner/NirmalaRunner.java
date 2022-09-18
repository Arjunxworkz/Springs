package com.xworkz.nirmalaRunner;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.nirmala.configration.NirmalaConfigration;
import com.xworkz.nirmala.service.NirmalaServiceImpl;
import com.xworkz.nirmalaEntity.NirmalaEntity;

public class NirmalaRunner {
public static void main(String []args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NirmalaConfigration.class);
	
	NirmalaServiceImpl bean = context.getBean(NirmalaServiceImpl.class);		
	NirmalaEntity nirmalaEntity=new NirmalaEntity(5, "banglore", "male", "public", 11.00, 10.00, "Darrshan", LocalDate.now(), "Manoj", LocalDate.now());
	//NirmalaDao nirmalaDao=new NirmalaDaoImpl();
	//nirmalaDao.save(nirmalaEntity);
	boolean validateAndSave = bean.validateAndSave(nirmalaEntity);
	System.out.println(validateAndSave);
	
	
}
}
