package Persistence.DAO;

import javax.persistence.EntityManager;
import Persistence.Model.Class.*;
import Persistence.Util.JPAutil;

public class DAOemail {

	EntityManager entityManager;
	
	public void create(Email object) {
		
		Email objEmail = new Email();
		
		try {
			
			entityManager = JPAutil.openConnection();
			entityManager.getTransaction().begin();
			entityManager.persist(objEmail);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			
			entityManager.getTransaction().rollback();
			
		} finally {
			
			entityManager.close();			
		}
	}
	
	public Email findById(Long id) {
		
		Email email = new Email();
		
		try {
			
			entityManager = JPAutil.openConnection();
			email = entityManager.find(Email.class, id);
			
		} catch (Exception e) {

			e.printStackTrace();
			
		} finally {
			
			entityManager.close();
		}
		
		return email;
	}
}
