package demoPackage;

public class EmergencyRoomProcess {

	public static void main(String[] args) {
		
		HospitalManagement ERDicrector = new HospitalManagement();
		Employee peggy = new Nurse(2, "Peggy", "emergency", true);
		ERDicrector.callUpon(peggy);
		Employee suzan = new Doctor(4, "Suzan", "emergency", true);
		ERDicrector.callUpon(suzan);
	}

}
