package domain.dao;

import domain.Employee;

public class EmployeeDAO {

	public EmployeeDAO() {
		
	}
	
	public void saveEmployee(Employee employee) {
		// save data to database
		/**
		 * 
		 *  DatabaseConnectionManager databaseConnection = DatabaseConnectionManager.getManagerInstance();'
		 *  databaseConnection.connect();
		 *  DatabaseConnectionManager.getManagerInstance().getConnectionObject().prepareStatement("some sql...");
		 *  databaseConnection.disconnect();
		 * */
		System.out.println("save employee to database");
	}
	
	public void removeEmployee(Employee employee) {
		/**
		 * DatabseConnectionManager.getManagerInstance().getConnectionObject().prepareStatement("some...sql")
		 * */
		System.out.println("Remove employee from database");
	}
}
