/**
 * 
 */
package modelo.persistencia.dao;

import java.util.List;

import org.hibernate.Session;

import modelo.persistencia.InstruccionesSQL;
import modelo.persistencia.InterfacDAO;
import modelo.persistencia.InterfacEmpleadoDao;
import modelo.dominio.*;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class EmpleadoDAO extends SuperClassDao implements InterfacDAO,InterfacEmpleadoDao {
	Session session;
	
	/**
	 *@param constructor 
	 */
	public EmpleadoDAO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}

	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacDAO#create(java.lang.Object)
	 */
	@Override
	public Object create(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacDAO#read(java.lang.Object)
	 */
	@Override
	public Object read(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacDAO#update(java.lang.Object)
	 */
	@Override
	public boolean update(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacDAO#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * 
	 */
	public List<Employees> obtenerEmpleados() {
		InstruccionesSQL instruccionesSQL = new InstruccionesSQL();
		List<Employees> lista = null;
		lista = this.session.createSQLQuery(instruccionesSQL.CONSULTAR_TODOS).addEntity(Employees.class).list();
		return lista;
		//"select * from EMPLOYEES"
	}
	public List<Employees> obtenerEmpleadosPorDepart(int i) {
		InstruccionesSQL instruccionesSQL = new InstruccionesSQL();
		List<Employees> lista = null;
		lista = this.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = "+i).addEntity(Employees.class).list();
		return lista;
		//"select * from EMPLOYEES"
	}

	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacEmpleadoDao#recuperarEmpleados()
	 */
	@Override
	public List<Employees> recuperarEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
