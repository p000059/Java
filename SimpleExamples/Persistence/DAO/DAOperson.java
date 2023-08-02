package Persistence.DAO;

import javax.persistence.EntityManager;
import javax.transaction.Transaction;
import Persistence.Model.Class.Person;
import Persistence.Util.JPAutil;

public class DAOperson {
	
	EntityManager entityManager;
	Transaction transaction;

	public Person findbyId(Long id) {
		
		Person person = new Person();
		
		try {
			
			entityManager = JPAutil.openConnection();
			person = entityManager.find(Person.class, id);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			entityManager.close();
		}
		
		return person;
	}
}
