/**
 * 
 */
package org.apache.struts.helloworld.action;

import java.math.BigDecimal;
import java.util.List;



/**
 * @author Jaime Gpetis
 *
 * 
 */
public class EmployessServices {
	private InterfacRecuperable iRecuperable;

	/**
	 * @param iRecuperable the iRecuperable to set
	 */
	public void setiRecuperable(InterfacRecuperable iRecuperable) {
		this.iRecuperable = iRecuperable;
	}
	/**
	 * 
	 */
	public Object leerEmpleado(int id) {
		Object obj_emp = null;
		obj_emp = this.iRecuperable.leerEmpleado(id);
		return obj_emp;
	
		

	}



}
