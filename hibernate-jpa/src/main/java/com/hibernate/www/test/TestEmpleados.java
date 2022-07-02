package com.hibernate.www.test;
 
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager; 
import com.hibernate.www.model.Empleado; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence; 

public class TestEmpleados {
	private static EntityManager manager;
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Persistencia");; 
	
 
	 
	public static void main(String[] args) {
		/*se crea el gestor de persistencia*/ 
		manager=(EntityManager) emf.createEntityManager();
		 
		insertar(); 
		modificar();
		
		
		imprimirTodo ();
		manager.close();
	}

	private static void modificar() {
		/*modificar*/
		manager.getTransaction().begin();
		Empleado em = manager.find(Empleado.class, 1L);
		em.setNombre("mateo");
		em.setApellidos("molina");
		em.setFecha(new GregorianCalendar(2002,01,11).getTime());
		manager.getTransaction().commit();
	}

	/*insertar*/
	private static void insertar() {
		Empleado empl= new Empleado();
		empl.setNombre("jared");
		empl.setApellidos("pineda"); 
		empl.setFecha(new GregorianCalendar(2001,05,11).getTime());
		manager.getTransaction().begin();
		manager.persist(empl);
		manager.getTransaction().commit();
	}
	 
	
	/*listar */
	@SuppressWarnings("unchecked")
	private static void imprimirTodo() {
		List<Empleado> emps = manager.createQuery("FROM Empleado").getResultList();
		System.out.println("hay "+emps.size()+" empleados");
		
		for (Empleado emp : emps) {
			System.out.println(emp.toString());
			
		}
		
	}
}
