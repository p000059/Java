package sj.model.SubClass;

import sj.model.ClassSuper.Common;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person")
@Entity
public abstract class Person extends Common {

	private static final long serialVersionUID = 1L;
	private List<Fone> fone;
	private List<Email> email;
	private List<Nationality> nationality;
	private List<Address> address;
	private List<Document> document;	
}
