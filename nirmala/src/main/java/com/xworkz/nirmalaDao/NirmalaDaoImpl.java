package com.xworkz.nirmalaDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.nirmalaEntity.NirmalaEntity;

import static com.xworkz.nirmalaUtil.NirmalaUtilFactory.*;

import java.util.List;

public class NirmalaDaoImpl implements NirmalaDao{
	EntityManagerFactory factory=getfactory();

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
		return false;
	}

	

}
