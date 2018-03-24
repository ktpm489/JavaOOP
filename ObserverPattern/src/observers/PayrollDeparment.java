package observers;

import domain.Employee;

public class PayrollDeparment implements IObserver{

	@Override
	public void callMe(Employee emp, String msg) {
		System.out.println("Payroll notified");
		System.out.println(msg + ":" + emp.getName());
	}

}
