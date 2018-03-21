package processes;

public class SmartphoneManufacturingProcess  extends GeneralManufacturingProcess{

	public SmartphoneManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembleDevice() {
	 System.out.println("Assembled SmartPhone");
		
	}

	@Override
	protected void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("Test smart phone");
	}

	@Override
	protected void packageDevice() {
		// TODO Auto-generated method stub
		System.out.println("Package smartphone");
	}

	@Override
	protected void storeDevice() {
		System.out.println("Store SmartPhone");
		
	}

}
