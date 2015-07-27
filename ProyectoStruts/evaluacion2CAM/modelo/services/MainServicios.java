/**
 * 
 */
package modelo.services;


import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import modelo.dominio.Employees;
import modelo.persistencia.SesionManager;


/**
 * @author Jaime Gpetis
 *
 * 
 */
public class MainServicios {
	public static void main(String[] args) {
		final Logger log = Logger.getLogger("mylog");
		log.error("JODER CON LOS Q TOCAN!!!!!");
		log.info("Informando...");
		log.warn("Cuidaito!!!!!");
		log.debug("A es igual a 12");
		log.trace("A que no sales!");
		EmployessServices employessServices = new EmployessServices();
		List<Employees> lis_emp = employessServices.obtenerEmpleadosPorDepartamento(50);
		Iterator<Employees> lista_emp = lis_emp.iterator();
		while (lista_emp.hasNext()) {
			lista_emp.next();
			System.out.println(lista_emp.next().imprime());
		}
//		ArrayList<Employees> arrayListEmpleados = employessServices.obtenerMejorPagadosPorDepartamentos();
//		Iterator<Employees> array_emp = arrayListEmpleados.iterator();
//		while (array_emp.hasNext()) {
//			System.out.println(array_emp.next().imprime());
//		}
		
		
		
//		employessServices.imcrementarSalario();
		SesionManager.getSessionFactory().close();
	
		
		
	}

}
