/**
 * 
 */
package modelo.services;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import modelo.persistencia.SesionManager;
import modelo.persistencia.dao.EmpleadoDAO;
import modelo.dominio.*;


/**
 * @author Jaime Gpetis
 *
 * 
 */
public class EmployessServices {
	EmpleadoDAO empleadoDAO;
	 
	private final Logger log = Logger.getLogger("mylog");

	/**
	 * @param constructor with parametro EmpleadoDAO empleadoDAO 
	 * 
	 */
	public EmployessServices() {
	
		EmpleadoDAO empleadoDAO = new EmpleadoDAO();
		this.empleadoDAO = empleadoDAO;
		
	}
	/**
	 * @return obtengo una nueva sesion
	 */
	public boolean imcrementarSalario() {
		boolean aumento = false;
		Session session = null;
		Transaction transaction = null;
		List<Employees> lista = null;
		try {
			//OBTENGO LA SESION
			session = SesionManager.obtenerSesionNueva();
			//COMINENZO LA TRANSSACCIÓN
			transaction = session.beginTransaction();
			//LE PASO AL - empleadoDAO - LA SESION PARA QUE TRABAJE CON ELLA 
			empleadoDAO.setSession(session);
			//LE PASO A LA lista de Employees los valores   
			lista = empleadoDAO.obtenerEmpleados();
			//AZTUALIZO EL SALARIO LLAMANDO
//			actualizarSalario(lista);
//			transaction.commit();
//			aumento = true;
		
		} catch (Exception e) {
			
    		transaction.rollback();//si algo ha ido mal, deshago la transacción
    		aumento = false;
    		e.printStackTrace();
		}finally {
			SesionManager.cerrarSession(session);
		}
		return aumento;
	}
	/**
	 * 
	 */
	private void actualizarSalario(List<Employees> lista_e) {
		//RECORRO LA LISTA DE EMPLEADOS CON UN  - forech -
		for(Employees emp: lista_e)
		{
			//SI MODIFICO EL ESTADO DE ESTE OBJETO - emp - LO MODIFICO EN BASE DE DATOS
			//ESTA EN PERSISTEND 
			//RECOJO EL SALARIO Y LE INCREMENTO UN - (1.20) -20% -
			//AL SER DE TIPO - BigDecimal - TENGO QUE PASARSELO ASI
			//- new BigDecimal(1.20) - CREANDOME UN NUEVO - BigDecimal - DE - Salary() - 
			emp.setSalary(emp.getSalary().multiply(new BigDecimal(1.20)));
		}
		

	}
	/**
	 * 
	 */
	public  ArrayList<Employees> obtenerMejorPagadosPorDepartamentos() {
		Session session = null;
		Transaction transaction = null;
		ArrayList<Employees> lista = new ArrayList<Employees>(11);
		try {
			//OBTENGO LA SESION
			session = SesionManager.obtenerSesionNueva();
			//COMINENZO LA TRANSSACCIÓN
			transaction = session.beginTransaction();
			//LE PASO AL - empleadoDAO - LA SESION PARA QUE TRABAJE CON ELLA 
			empleadoDAO.setSession(session);
			//LE PASO A LA lista de Employees los valores   
			for (int i = 10; i <= 110 ;i+=10) {
			lista.add(empleadoMejorPagado(empleadoDAO.obtenerEmpleadosPorDepart(i)));
			}
			
			
			transaction.commit();
			
		
		} catch (Exception e) {
			
    		transaction.rollback();//si algo ha ido mal, deshago la transacción
    		
    		e.printStackTrace();
		}finally {
			SesionManager.cerrarSession(session);
		}
		
		
		return lista;
	
		

	}
	public List<Employees> obtenerEmpleadosPorDepartamento(Object depart){
		Session session = null;
		Transaction transaction = null;
		List<Employees> lista = null;
		try {
			//OBTENGO LA SESION
			session = SesionManager.obtenerSesionNueva();
			//COMINENZO LA TRANSSACCIÓN
			transaction = session.beginTransaction();
			//LE PASO AL - empleadoDAO - LA SESION PARA QUE TRABAJE CON ELLA 
			empleadoDAO.setSession(session);
			//LE PASO A LA lista de Employees los valores   
			lista = empleadoDAO.obtenerEmpleadosPorDepart((int) depart);
			
			transaction.commit();
			
		
		} catch (Exception e) {
			log.error("error al obtener empleados por departatmento");
    		transaction.rollback();//si algo ha ido mal, deshago la transacción
    		
    		e.printStackTrace();
		}finally {
			SesionManager.cerrarSession(session);
		}
	
		return lista;	
	}
	
	public Employees empleadoMejorPagado(List<Employees> lista_emp){
		Employees empleado = null;
		Employees e1 = null;
		
		Iterator<Employees> it_e = lista_emp.iterator();
		empleado = it_e.next();
		while (it_e.hasNext()) {
			e1 = it_e.next();
			if (e1.getSalary().intValue()>empleado.getSalary().intValue()) {
				empleado =e1;
			}
		}
		return empleado;
	}
	
	
	
	
	
	
}
