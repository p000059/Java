package Persistence.App;

import javax.persistence.EntityManager;

import Persistence.Util.*;

public class App {

	public static void main(String[] args) {
		
		try {
			
			EntityManager entityManager = JPAutil.openConnection();
			System.out.println("\n\nSuccessfuly Connection -> " + entityManager.toString() + "\n\n");
			
		} catch (Exception e) {

			System.out.println("\n\nError: \n\n" + e.getMessage());
			
		} finally {
			
			JPAutil.closeConnection();			
		}
	}
}
