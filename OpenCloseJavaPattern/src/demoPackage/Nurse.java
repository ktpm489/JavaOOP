package demoPackage;

public class Nurse extends Employee{

	public Nurse(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		// TODO Auto-generated constructor stub
	}
	private void checkVitalSigns() {
		System.out.println("Check Vitals");
	}
	
	private void drawBlood() {
		System.out.println("Drawing blood");
	}
	
	private void cleanPatientArea() {
		System.out.println("Cleaning Patinent Area");
	}

	@Override
	void performDuties() {
		// TODO Auto-generated method stub
		checkVitalSigns();
		 drawBlood();
		 cleanPatientArea();
	}

}
