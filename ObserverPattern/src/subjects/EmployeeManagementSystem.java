package subjects;

import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.EmployeeDAO;
import observers.IObserver;

public class EmployeeManagementSystem implements ISubject {

	private Employee emp;
	private String msg = null;
	private List<IObserver> observers;
	private List<Employee> employess;
	private EmployeeDAO employeeDAO;
	
	public EmployeeManagementSystem() {
		observers = new ArrayList<>();
		employeeDAO = new EmployeeDAO();
		employess = employeeDAO.generateEmployees();
	}
	
	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;
		for (Employee employee : employess) {
			if (id == employee.employeeID) {
				employee.setName(newName);
				this.emp = employee;
				this.msg = "Employee Name Changed";
				notify = true;
			}
		}
		if (notify) {
			notifyObservers();
		}
	}
	
	public void hireNewEmployee(Employee emp) {
		this.emp = emp;
		this.msg = "New hire";
		notifyObservers();
	}
	
	@Override
	public void registerObserver(IObserver addMe) {
		// the observers addted to this list are interested in getting notified
		observers.add(addMe);
		
	}

	@Override
	public void removeObserver(IObserver removeMe) {
		int index = observers.indexOf(removeMe);
		observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for (IObserver deparment: observers) {
			deparment.callMe(emp, msg);
		}
		
	}

}
