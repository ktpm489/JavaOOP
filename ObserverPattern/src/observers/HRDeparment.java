package observers;

import domain.Employee;

public class HRDeparment implements IObserver {

	@Override
	public void callMe(Employee emp, String msg) {
		System.out.println( "HR Deparment notified...");
		System.out.println(msg + ": " + emp.getName());
		
	}

}
