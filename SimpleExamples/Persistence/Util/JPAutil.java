package Persistence.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {

	public static EntityManagerFactory factory = null;
	private final static String PERSISTENCE_UNIT = "dbcodes";

	static {
		init();
	}

	private static void init() {

		try {

			if (factory == null) {

				factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
			}

		} catch (Exception e) {

			e.getMessage();
		}
	}

	public static EntityManager openConnection() {

		return factory.createEntityManager();
	}

	public static void closeConnection() {

		try {

			if (factory != null) {

				factory.close();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
