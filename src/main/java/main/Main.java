package main;



	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

import teste1.Employee;
	 
public class Main {
	
	    private static EntityManager em;
	 
	    public static void main(String[] args) {
	 
	    		System.out.println("Antes do entity manager");
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePU");
	        	System.out.println("Conteúdo do Factory: " + emf);
	        em = emf.createEntityManager();
	        	System.out.println("Conteúdo do entitymanager: " + em);
	 
	        createEmployee("Rafael", "Cris", "Textile");
	        createEmployee("Joab", "Freijó", "IT");
	        createEmployee("Carlos", "Niemayer", "Marketing");
	 
	    }
	 
	    	//int id,
	    private static void createEmployee(
	    		 
	    		String firstName,
	            String lastName, 
	            String dept) {
	        em.getTransaction().begin();
	        Employee emp = new Employee(firstName, lastName, dept);
	        em.persist(emp);
	        em.getTransaction().commit();
	    }
	}

