/**
 * 
 */
package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class FormularioAction extends ActionSupport {
	private Coche coche;
	
	/**
	 * @return the coche
	 */
	public Coche getCoche() {
		return coche;
	}

	/**
	 * @param coche the coche to set
	 */
	@TypeConversion(converter="org.apache.struts.helloworld.action.ConversorCoche")
	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() {
		Coche coche = new Coche();
		return SUCCESS;
	}
	

}
