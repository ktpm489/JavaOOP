
public class App {

	public static void main(String[] args) {
		
		User websiteUser = new User.Builder("user1", "user1@gmail.com")
				.firstName("bob").lastName("max").build();
		System.out.println(websiteUser);
	}

}
