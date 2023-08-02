package Class.SubClass;

import java.util.List;

import Class.ClassSuper.Common;

public abstract class Person extends Common {

	private List<Fone> fone;
	private List<Email> email;
	private List<Nationality> nationality;
	private List<Address> address;
	private List<Document> document;

	public Person() {
		
	}

	public Person(List<Fone> fone, List<Email> email, List<Nationality> nationality, List<Address> address,
			List<Document> document) {
		
		this.fone = fone;
		this.email = email;
		this.nationality = nationality;
		this.address = address;
		this.document = document;
	}

	public List<Fone> getFone() {
		return fone;
	}

	public void setFone(List<Fone> fone) {
		this.fone = fone;
	}

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	public List<Nationality> getNationality() {
		return nationality;
	}

	public void setNationality(List<Nationality> nationality) {
		this.nationality = nationality;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Document> getDocument() {
		return document;
	}

	public void setDocument(List<Document> document) {
		this.document = document;
	}
}
