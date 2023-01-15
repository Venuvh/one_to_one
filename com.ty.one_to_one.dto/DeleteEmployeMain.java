package hibernet_maven_eb9;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class DeleteEmployeMain {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("venu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employe employe=entityManager.find( Employe.class,  1);
		entityTransaction.begin();
		
		entityManager.remove(employe);
		
		entityTransaction.commit();
	}
	
	
}
