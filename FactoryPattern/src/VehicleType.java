// https://stackoverflow.com/questions/2709593/why-would-an-enum-implement-an-interface
// https://stackoverflow.com/questions/7413872/can-an-enum-have-abstract-methods
// Enums don't just have to represent passive sets (e.g. colours). They can represent more complex objects with functionality, and so you're then likely to want to add further functionality to these - e.g. you may have interfaces such as Printable, Reportable etc. and components that support these.
public enum VehicleType {
	
	TRUCK{
		public Vehicle getVehicle() {
			return new Truck();
		}
	},
	CAR {
		public Vehicle getVehicle() {
			return new Car(); 
		}
	};
	
	abstract Vehicle getVehicle();
}
