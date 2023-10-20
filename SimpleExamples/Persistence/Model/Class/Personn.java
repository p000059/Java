package Persistence.Model.Class;

public class Personn {

	private int id;
	private String name;
	private boolean status;

	public Personn() {

	}

	public Personn(int id) {
		super();
		this.id = id;
	}

	public Personn(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Personn(String name, boolean status) {
		super();
		this.name = name;
		this.status = status;
	}

	public Personn(int id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
