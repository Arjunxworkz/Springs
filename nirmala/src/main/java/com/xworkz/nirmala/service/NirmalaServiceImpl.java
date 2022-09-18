package com.xworkz.nirmala.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.nirmala.dao.NirmalaDao;
import com.xworkz.nirmalaEntity.NirmalaEntity;
@Component
public class NirmalaServiceImpl implements NirmalaService {
	@Autowired
	private NirmalaDao nirmalaDao;

	public boolean validateAndSave(NirmalaEntity nirmalaEntity) {
     ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
     Validator validator = buildDefaultValidatorFactory.getValidator();
     Set<ConstraintViolation<NirmalaEntity>> validate = validator.validate(nirmalaEntity);
     if(validate.size()>0) {
    	 System.err.println("invalid");
     }
     else {
    	 System.out.println("valid");
    	 boolean save = nirmalaDao.save(nirmalaEntity);
    	 System.out.println(save);
     }
  
		return true;
	}

}
