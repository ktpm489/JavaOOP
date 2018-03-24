
public class User {
	private String userName; // required
	private String emailAddress; // required
	private String firstName; // optional
	private String lastName; // optional
	private int phoneNumber; // optional
	private String address; // optional
	
	public User(Builder builder) {
		this.userName = builder.userName;
		this.emailAddress = builder.emailAddress;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}
	@Override
	public String toString() {
		return "User [username=" +  userName + ", emailAddress=" + emailAddress + ", firstName=" + firstName + ", lastName = " + lastName
				+ ", phoneNumer=" + phoneNumber + ", address=" + address + "]";
	}

	// create builder object
	public static class Builder{
		private String userName; // required
		private String emailAddress; // required
		private String firstName; // optional
		private String lastName; // optional
		private int phoneNumber; // optional
		private String address; // optional
		
		public Builder(String userName ,String email) {
			this.userName = userName;
			this.emailAddress = email;
		}
		
		public Builder firstName(String value) {
			this.firstName = value;
			return this;
		}
		public Builder lastName(String value) {
			this.lastName = value;
			return this;
		}
		public User build() {
			return new User(this);
		}
	}
}
