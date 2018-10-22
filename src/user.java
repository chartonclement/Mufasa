
public class user {
	private String name;
	private String lastname;
	private String username;
	private String password;
	private String password2;
	private country country;
	private String birthday;
	private String phonenumber;
	private String emailaddress;
	public user(String name, String lastname, String username, String password, String password2, country country, String birthday, String phonenumber, String emailaddress) {
		this.name = name;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.password2 = password2;
		this.country = country;
		this.birthday = birthday;
		this.phonenumber = phonenumber;
		this.emailaddress = emailaddress;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public country getCountry() {
		return country;
	}

	public void setCountry(country country) {
		this.country = country;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

}
