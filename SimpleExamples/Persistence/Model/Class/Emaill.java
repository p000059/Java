package Persistence.Model.Class;

public class Emaill {

	private int id;
	private String email;
	private boolean status;
	
	public Emaill() {
		super();
	}

	public Emaill(int id, String email, boolean status) {
		super();
		this.id = id;
		this.email = email;
		this.status = status;
	}

	public Emaill(String email, boolean status) {
		super();
		this.email = email;
		this.status = status;
	}
	
	public Emaill(String email) {
		super();
		this.email = email;
	}
	
	public Emaill(boolean status) {
		super();
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
