package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		/*
		Person p1 = new Person(null,"Carlos da Silva","carlos@gmail.com");
		Person p2 = new Person(null,"Joaquin Torres","joaquin@gmail.com");
		Person p3 = new Person(null,"Ana Maria","ana@gmail.com");
		*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Completed");
		*/
		
		em.getTransaction().begin();
		Person p = em.find(Person.class, 2);
		em.remove(p);
		System.out.println(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
