package clients;

import java.util.Date;

import domain.Employee;
import observers.HRDeparment;
import observers.IObserver;
import observers.PayrollDeparment;
import subjects.EmployeeManagementSystem;

public class App {

	public static void main(String[] args) {
		
		IObserver payroll = new PayrollDeparment();
		IObserver hrSystem = new HRDeparment();
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		Employee bob = new Employee("Bob", new Date(), 35000, true);
		ems.hireNewEmployee(bob);
		
		ems.modifyEmployeeName(2, "Demo5");
	}

}
