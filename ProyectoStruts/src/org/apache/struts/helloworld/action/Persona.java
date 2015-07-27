/**
 * 
 */
package org.apache.struts.helloworld.action;



/**
 * @author Jaime Gpetis
 *
 * 
 */
public class Persona {
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
	 * @return the Edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the Edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nom,int ed){

		this.edad = ed; 
		this.nombre = nom;
	}
	
}
