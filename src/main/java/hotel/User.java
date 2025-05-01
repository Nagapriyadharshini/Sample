package hotel;

public class User {
	
	private String userName;
	private String userEmail;
	private Long userContact;
	private String userPassword;
	public User(String userName, String userEmail, Long userContact, String userPassword) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getUserContact() {
		return userContact;
	}

	public void setUserContact(Long userContact) {
		this.userContact = userContact;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", userContact=" + userContact
				+ ", userPassword=" + userPassword + "]";
	}
	

}
