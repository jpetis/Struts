/**
 * 
 */
package org.apache.struts.helloworld.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;


/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ConsultarEmpleado extends ActionSupport{
	private EmployeeDTO empleado;
	private int id;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	/**
	 * @return the empleado
	 */
	public EmployeeDTO getEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(EmployeeDTO empleado) {
		this.empleado = empleado;
	}
	public String execute() throws Exception {
		
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "petis");
  	        stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from Employees where EMPLOYEE_ID = "+id);
			while (rset.next()) {
				
				empleado = componerObjeto(rset);
				System.out.println(empleado.getFIRST_NAME());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
		}
		
		
		return SUCCESS;   

	}
	private static EmployeeDTO componerObjeto(ResultSet rs) throws SQLException{
		EmployeeDTO empleado = null;
		
		 int employee_Id = rs.getInt(1);
		String first_Name = rs.getString(2);
		String last_Name = rs.getString(3);
		String email = rs.getString(4);
		String phone_Number = rs.getString(5);
		String hire_Date = rs.getString(6);
		String job_Id = rs.getString(7);
		int salary = rs.getInt(8);
		int commission_Pct = rs.getInt(9);
		int manager_Id = rs.getInt(10);
		int department_Id = rs.getInt(11);
		
		empleado = new EmployeeDTO(employee_Id, first_Name, last_Name, email, phone_Number, hire_Date, job_Id, salary, commission_Pct, manager_Id, department_Id);
		
		
		return empleado;
	}



}
