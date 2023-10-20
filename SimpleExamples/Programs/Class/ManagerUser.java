package Programs.Class;

public class ManagerUser {
	
	private String user;
	private String password;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void createUser(String user) {
		
		this.setUser(user);
	}
	
	public void createPassword(String password) {
		
		this.setPassword(password);
	}
	
	public Boolean checkUser(String user) {
		
		return this.getUser().equals(user) ? true : false;
	}
	
	public Boolean checkPassword(String password) {
		
		return this.getPassword().equals(password) ? true : false;
		
	}	
}
