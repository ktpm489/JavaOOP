package demoPackage;

public class Doctor  extends Employee{

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		// TODO Auto-generated constructor stub
	}
	private void prescribeMedicine() {
		System.out.println("Prescribe Medicine");
	}
	private void diagnosePatients() {
		System.out.println("Diagnosing Patient");
	}
	
	@Override
	void performDuties() {
		prescribeMedicine();
		diagnosePatients();
	}
}
