/**
 * 
 */
package org.apache.struts.helloworld.action;



import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ActionPersona extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Persona persona ;
	private String nombre ;
	private int edad ;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public String execute() throws Exception {
		System.out.println("Nombre :" + this.nombre);
		System.out.println("Edad :" + this.edad);
		persona = new Persona(nombre, edad);
		
		return SUCCESS;
	}
}
