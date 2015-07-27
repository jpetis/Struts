/**
 * 
 */
package modelo.persistencia;

import java.util.List;

import modelo.dominio.Employees;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public interface InterfacEmpleadoDao extends InterfacDAO{
	List<Employees> recuperarEmpleados();
}
