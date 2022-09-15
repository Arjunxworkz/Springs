package com.xworkz.metroDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import static com.xworkz.factoryUtil.MetroUtilFactory.*;

import java.util.List;

import com.xworkz.metroEntity.MetroEntity;


public class MetroDaoImpl implements MetroDAO{
	EntityManagerFactory factory = getfactory();
	
	

	public boolean saveMetroDetials(List<MetroEntity> metroEntity) {
		
		EntityManager manager=factory.createEntityManager();
		try {
			EntityTransaction tx =manager.getTransaction();
		    tx.begin();
		    for (MetroEntity metroEntity2 : metroEntity) {
				manager.persist(metroEntity2);
			}
            tx.commit();
			

		    
		}catch (PersistenceException e) {
			e.printStackTrace();
		}
		return false;
	}




}
