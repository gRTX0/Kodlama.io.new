package homework;

public class User extends PersonManager{
	
	int id;
	private String lastname;
	private String firstanme;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstanme() {
		return firstanme;
	}
	public void setFirstanme(String firstanme) {
		this.firstanme = firstanme;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
