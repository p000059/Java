package DesignPattern.Builder.Class;

public class Product {

	private Long id;
	private String name;
	private String description;
	private Double value;
	private String color;
	private String size;
	
	private Product(Builder builder) {
		super();
		this.id = builder.id;
		this.name = builder.name;
		this.description = builder.description;
		this.value = builder.value;
		this.color = builder.color;
		this.size = builder.size;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	public static class Builder {
		
		private Long id;
		private String name;
		private String description;
		private Double value;
		private String color;
		private String size;
		
		public Builder() {
			
		}
		
		public Builder (Long id) {
			this.id = id;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder description(String description) {
			this.description = description;
			return this;
		}
		
		public Builder value(Double value) {
			this.value = value;
			return this;
		}
		
		public Builder color(String color) {
			this.color = color;
			return this;
		}
		
		public Builder size(String size) {
			this.size = size;
			return this;
		}		
		
		public Product build() {
			return new Product(this);
		}
	}
	
}
