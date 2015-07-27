/**
 * 
 */
package org.apache.struts.helloworld.action;

import java.util.Date;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class EmpleadoDTO {
	private int employee_Id;
	private String first_Name;
	private String last_Name;
	private String email;
	private String phone_Number;
	private String hire_Date;
	private String job_Id;
	/**
	 * @param employee_Id the employee_Id to set
	 */
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	/**
	 * @param first_Name the first_Name to set
	 */
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	/**
	 * @param last_Name the last_Name to set
	 */
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param phone_Number the phone_Number to set
	 */
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	/**
	 * @param hire_Date the hire_Date to set
	 */
	public void setHire_Date(String hire_Date) {
		this.hire_Date = hire_Date;
	}
	/**
	 * @param job_Id the job_Id to set
	 */
	public void setJob_Id(String job_Id) {
		this.job_Id = job_Id;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	/**
	 * @param commission_Pct the commission_Pct to set
	 */
	public void setCommission_Pct(String commission_Pct) {
		this.commission_Pct = commission_Pct;
	}
	/**
	 * @param manager_Id the manager_Id to set
	 */
	public void setManager_Id(String manager_Id) {
		this.manager_Id = manager_Id;
	}
	/**
	 * @param department_Id the department_Id to set
	 */
	public void setDepartment_Id(int department_Id) {
		this.department_Id = department_Id;
	}

	private float salary;
	private String commission_Pct;
	private String manager_Id;
	private int department_Id;
	
	
	
	public EmpleadoDTO(int employee_Id, String first_Name, String last_Name,
			String email, String phone_Number, String hire_Date, String job_Id,
			float salary, String commission_Pct, String manager_Id,
			int department_Id) {
		this.employee_Id = employee_Id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
		this.phone_Number = phone_Number;
		this.hire_Date = hire_Date;
		this.job_Id = job_Id;
		this.salary = salary;
		this.commission_Pct = commission_Pct;
		this.manager_Id = manager_Id;
		this.department_Id = department_Id;
	}
	public EmpleadoDTO(String first_Name, String last_Name){
		this.first_Name=first_Name;
		this.last_Name=last_Name;
	}
	/**
	 * @param employee_Id2
	 * @param first_Name2
	 * @param last_Name2
	 * @param email2
	 * @param phone_Number2
	 * @param hire_Date2
	 * @param job_Id2
	 * @param salary2
	 * @param commission_Pct2
	 * @param manager_Id2
	 * @param department_Id2
	 */
	public EmpleadoDTO(int employee_Id2, String first_Name2, String last_Name2,
			String email2, String phone_Number2, String hire_Date2,
			String job_Id2, int salary2, String commission_Pct2,
			String manager_Id2, int department_Id2) {
		// TODO Auto-generated constructor stub
	}
	public int getEmployee_Id() {
		return employee_Id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone_Number() {
		return phone_Number;
	}
	public String getHire_Date() {
		return hire_Date;
	}
	public String getJob_Id() {
		return job_Id;
	}
	public float getSalary() {
		return salary;
	}
	public String getCommission_Pct() {
		return commission_Pct;
	}
	public String getManager_Id() {
		return manager_Id;
	}
	public int getDepartment_Id() {
		return department_Id;
	}	
	
	@Override
	public String toString() {
		return first_Name + "\t \t " + salary;
	}

}
