package Persistence.Model.Class;

public class PersonEmail {

	private int person_id;
	private int email_id;
	
	public PersonEmail() {
		super();
	}

	public PersonEmail(int person_id, int email_id) {
		super();
		this.person_id = person_id;
		this.email_id = email_id;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public int getEmail_id() {
		return email_id;
	}

	public void setEmail_id(int email_id) {
		this.email_id = email_id;
	}
}
