package observers;

import domain.Employee;

public interface IObserver {

	void callMe(Employee emp, String msg); // When something change in the subject it should call this method.
}
