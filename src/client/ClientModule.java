package client;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		
		Employee peggy = new Employee(1,"peggy", "accounting", true);
		hireNewEmployee(peggy);
		terminateEmployee(peggy);
		printEmployeeReport(peggy, FormatType.CSV);

	}
	
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.saveEmployee(employee);
	}
	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.removeEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee ,FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}

}
