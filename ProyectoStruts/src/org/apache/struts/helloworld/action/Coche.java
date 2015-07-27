/**
 * 
 */
package org.apache.struts.helloworld.action;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class Coche {
	private String marca;
	private String matricula;
	
	/**
	 * 
	 */
	public Coche() {
		
	}
	public Coche(String marca, String matricula){
		this.marca = marca;
		this.matricula = matricula;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return marca+matricula;
	}

	

}
