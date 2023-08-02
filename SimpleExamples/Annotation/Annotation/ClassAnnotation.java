package Annotation.Annotation;

import javax.annotation.Nonnull;

import jakarta.persistence.Entity;

public class ClassAnnotation {

	@Nonnull
	@Entity
	@SuppressWarnings(value = {"unchecked", "deprecation"})
	@ClassPreamble(author = "Marcelo", date = "15041982", value = "5")
	public class Annotation{
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
