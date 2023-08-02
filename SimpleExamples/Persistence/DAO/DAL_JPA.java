package Persistence.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Persistence.Model.Class.Person;

public class DAL_JPA {

	private static final EntityManagerFactory entityManagerFactory;
    private static final String PERSISTENCE_UNIT_NAME = "dbcodes"; 

	static {
		
		entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	public static EntityManager getEntityManager() {
		
		return entityManagerFactory.createEntityManager();
	}
	
	public void save(Person objPerson) {
		
		try {
			
			getEntityManager().getTransaction().begin();
			getEntityManager().persist(objPerson);			
			getEntityManager().getTransaction().commit();
			

		} catch (Exception e) {

			try {
				getEntityManager().getTransaction().rollback();
				
			} catch (Exception e1) {
				
				e.getMessage();
			}

			
		} finally {
			
			getEntityManager().close();
		}
	}
	
	public Person findId(Integer id) {
		
		Person objPerson = null;
		
		try {
			
			getEntityManager().getTransaction().begin();
			objPerson = getEntityManager().find(Person.class, id);
			
		} catch (Exception e) {
			
			e.getMessage();
			
		} finally {
			
			getEntityManager().close();
			
		}
		
		return objPerson;
	}
	
	public void removeId(Integer id) {
		
		Person objPerson;
		
		try {
			
			objPerson = getEntityManager().find(Person.class, id);
			
			getEntityManager().getTransaction().begin();
			getEntityManager().remove(objPerson);
			getEntityManager().getTransaction().commit();
			
		} catch (Exception e) {
			
			e.getMessage();
			
		} finally {
			
			getEntityManager().close();
			
		}
	}
}
