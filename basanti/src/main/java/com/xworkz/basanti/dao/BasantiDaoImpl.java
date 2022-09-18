package com.xworkz.basanti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.basanti.entity.BasantiEntity;
import static com.xworkz.basanti.factory.BasantiFactory.*;

public class BasantiDaoImpl implements BasantiDAO {
	EntityManagerFactory factory =getfactory();
	public BasantiDaoImpl(BasantiEntity basantiEntity) {
		
	}
	public boolean save(BasantiEntity basantiEntity) {
	EntityManager manager = factory.createEntityManager();
	try {
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(basantiEntity);
		tx.commit();
	} catch (PersistenceException e) {
		e.printStackTrace();
		
	}finally {
		manager.close();
	}
	
	return false;
	}
	


}
