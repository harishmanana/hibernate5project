package hibpack;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate example to insert data into Contact table
 */

public class FirstExample {
	public static void main(String[] args) {
		Session session = null;
		StandardServiceRegistry registry =  null;
		SessionFactory sessionFactory = null;
		try {
			// Create registry
			registry = new StandardServiceRegistryBuilder().configure().build();

			// Create MetadataSources
			MetadataSources sources = new MetadataSources(registry);

			// Create Metadata
			Metadata metadata = sources.getMetadataBuilder().build();

			// Create SessionFactory
			sessionFactory = metadata.getSessionFactoryBuilder().build();
			session = sessionFactory.openSession();

			Transaction tx = session.beginTransaction();

			// Create new instance of Contact and set values in it
			System.out.println("Inserting Record");
			Contact contact = new Contact();
			contact.setId(333);
			contact.setFirstName("Harish");
			contact.setLastName("Manana");
			contact.setEmail("harishmanana@yahoo.com");
			session.save(contact);
			System.out.println("Done");
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// Actual contact insertion will happen at this step
			session.close();
		}
	}
}
