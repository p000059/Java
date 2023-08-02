package Optional.Class;

public class Person {

	private Long id;
	private String name;
	private String lastName;
	private String description;
	private Integer age;
	
	private Person() {
		
	}
	
	private Person(Builder builder){
		
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.lastName = builder.lastName;
		this.description = builder.description;
		this.age = builder.age;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescription() {
		
		return description;
	}
	
	public void setDescription(String description) {
		
		this.description = description;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public static class Builder {
		
		private Long id;
		private String name;
		private String lastName;
		private String description;
		private Integer age;
		
		public Builder() {
			
		}
		
		public Builder (Long id) {
			
			this.id = id;
		}
		
		public Builder name(String name) {
			
			this.name = name;
			return this;
		}
		
		public Builder lastName(String lastName) {
			
			this.lastName = lastName;
			return this;
		}
		
		public Builder description(String description) {
			
			this.description = description;
			return this;
		}
		
		public Builder age(Integer age) {
			
			this.age = age;
			return this;
		}
		
		public Person builder() {
			
			return new Person(this);
		}
	}
}
