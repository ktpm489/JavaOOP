package domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	List<Employee> employees;

	public List<Employee> generateEmployees() {
		employees = new ArrayList<>();
		Employee emp1 = new Employee("Mike", null, 5000, false);
		Employee emp2 = new Employee("Mike1", null, 5000, false);
		Employee emp3 = new Employee("Mike2", null, 5000, false);
		Employee emp4 = new Employee("Mike3", null, 5000, false);
		Employee emp5 = new Employee("Mike4", null, 5000, false);
		employees.add(emp2);
		employees.add(emp1);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		return employees;
	}

	public void addEmployee(Employee emp) {
		if (employees != null) {
			employees.add(emp);
		}
	}
}
