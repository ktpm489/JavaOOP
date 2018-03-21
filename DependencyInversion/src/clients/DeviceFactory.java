package clients;

import processes.GeneralManufacturingProcess;
import processes.LaptopManufacturingProcess;

public class DeviceFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralManufacturingProcess manfacturer = new LaptopManufacturingProcess("DELL LAPTOP");
		manfacturer.launchProcess();
	}	

}
