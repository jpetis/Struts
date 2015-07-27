/**
 * 
 */
package org.apache.struts.helloworld.action;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ComversorCoche extends StrutsTypeConverter{

	/* (non-Javadoc)
	 * @see org.apache.struts2.util.StrutsTypeConverter#convertFromString(java.util.Map, java.lang.String[], java.lang.Class)
	 */
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		Coche coche = new Coche(arg1[0], arg1[1]);
		return coche;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.util.StrutsTypeConverter#convertToString(java.util.Map, java.lang.Object)
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		Coche coche = (Coche) arg1;
		return coche.toString();
	}
	
}
