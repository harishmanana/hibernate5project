package hibpack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * To fatch data from Contact table
 */

public class GetExample {
	public static void main(String[] args) {
		Session session = null;

		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for
			// use
			Configuration cfg = new Configuration();
			SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			
			System.out.println("session " + session.getClass());
			Contact c = new Contact();
			c.setFirstName("Rakesh");
			c.setLastName("Reddy");
			c.setEmail("sanjeev@gmail.com");
			c.setId(102);
			
			session.update(c);
			
		} catch (Exception e) {
			System.out.println("EXCEPTIN " + e.getMessage());
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}
}
