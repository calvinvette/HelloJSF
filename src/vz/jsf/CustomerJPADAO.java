package vz.jsf;

import java.util.List;
import java.util.ListResourceBundle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class CustomerJPADAO {
	@PersistenceContext
	private EntityManager entityManager;
	public EntityManager getEntityManager() {
		if (entityManager == null) { // Injection didn't work, fallback to EMF
			entityManager = getEntityManagerFactory().createEntityManager();
		}
		return entityManager;
	}
	
	private static EntityManagerFactory entityManagerFactory;
	public static EntityManagerFactory getEntityManagerFactory() {
		if (entityManagerFactory == null) { // Injection didn't work, fallback
			// Persistence.createEMF uses the META-INF/persistence.xml file
			// to construct connections and prepare dialectic SQL statements
			entityManagerFactory = Persistence.createEntityManagerFactory("Weasley");
		}
		return entityManagerFactory;
	}
	
	// TODO - migrate this to the Customer class as a @NamedQuery
	public List<Customer> findAll() {
		return getEntityManager()
				.createQuery("select c from Customer c", Customer.class)
				.getResultList();
	}
	
	public void insert(Customer customer) {
		getEntityManager().persist(customer);
	}
	
	public void delete(Customer customer) {
		getEntityManager().remove(customer);
	}
	
	public Customer update(Customer customer) {
		return getEntityManager().merge(customer);
	}
	
	public Customer findById(Long customerId) {
		return getEntityManager().find(Customer.class, customerId);
	}
	
	// TODO - migrate this to the Customer class as a @NamedQuery
	public List<Customer> findByLastName(String lastName) {
		return getEntityManager()
				.createQuery("select c from Customer c where c.lastName = :lastName", Customer.class)
				.setParameter("lastName", lastName)
				.getResultList();
	}
	
}
