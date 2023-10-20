package Persistence.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Persistence.Util.JPAutil;

public class DALGeneric<T> {

	private static final EntityManagerFactory entityManagerFactory;
    private static final String PERSISTENCE_UNIT_NAME = "JPADemo"; 

	static {
		
		entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	public static EntityManager getEntityManager() {
		
		return entityManagerFactory.createEntityManager();
	}
	
	private EntityManager entityManager = JPAutil.openConnection();
	
	public void createGeneric(T entity) {

		
		try {
			
			getEntityManager().getTransaction().begin();
			entityManager.persist(entity);
			getEntityManager().getTransaction().commit();
			
		} catch (Exception e) {
			
			getEntityManager().getTransaction().rollback();
			e.getMessage();
			
		} finally {
			
			getEntityManager().close();
		}
	}

	
	public T getGeneric(Class<T> entity, T id) {
		
		T objGeneric = null;
		
		try {
			
			objGeneric = (T) getEntityManager().find(entity, id);
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		return objGeneric; 
	}
	
	public T getGenericIdClass(Integer id, Class<T> entity) {
		
		T objGeneric = null;
		
		try {
			
			objGeneric = (T) getEntityManager().find(entity, id);
			
		} catch (Exception e) {
			
			e.getMessage();
			
		} finally {
			
			getEntityManager().close();
		}
		
		return objGeneric;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> getAllGeneric(Class<T> entity) {

		List<T> lstGeneric = new ArrayList<>();
		
		try {
			
			lstGeneric = (List<T>) getEntityManager().createQuery("FROM" + entity.getName()).getResultList();
			 
			
		} catch (Exception e) {
			
			e.getMessage();
			
		} finally {
			
			getEntityManager().close();
		}
		
		return lstGeneric;
	}
	
	public void updateGeneric(T entity) {
		
		try {
			
			getEntityManager().getTransaction().begin();
			getEntityManager().merge(entity);
			getEntityManager().getTransaction().commit();
			
		} catch (Exception e) {
			
			getEntityManager().getTransaction().rollback();
			e.getMessage();
			
		} finally {
			
			getEntityManager().close();
		}
	}
	
	public void deleteGeneric(T entity, Integer id) {
		
		try {
			
			getEntityManager().getTransaction().begin();
			getEntityManager().createNativeQuery("DELETE FROM " + entity.getClass().getSimpleName().toLowerCase() + "WHERE ID = " + id).executeUpdate();
			getEntityManager().getTransaction().commit();
			
			
		} catch (Exception e) {
			
			getEntityManager().getTransaction().rollback();
			e.getMessage();
			
		} finally {
			
			getEntityManager().close();
		}
		
	}
}
