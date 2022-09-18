package com.xworkz.nirmala.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.nirmalaEntity.NirmalaEntity;


import java.util.List;
@Component
public class NirmalaDaoImpl implements NirmalaDao{
	@Autowired
	EntityManagerFactory factory;

	public boolean save(NirmalaEntity nirmalaEntity) {
		EntityManager manager=factory.createEntityManager();
		
		try {
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			manager.persist(nirmalaEntity);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	

}
