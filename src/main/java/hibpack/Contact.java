package hibpack;

/**
 * Java Class to map to the database Contact Table
 */

public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private long id;

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setEmail(String string) {
		email = string;
	}

	public void setFirstName(String string) {
		firstName = string;
	}

	public void setLastName(String string) {
		lastName = string;
	}

	public long getId() {
		return id;
	}

	public void setId(long l) {
		id = l;
	}
}
