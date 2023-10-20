package Persistence.Model.Class;

import java.io.Serializable;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "person")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotNull(message = "It cannot be null.")
	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "firstName", column = @Column(name = "first_name")),
			@AttributeOverride(name = "lastName", column = @Column(name = "last_name"))
	})
	private PersonName personName;

	@NotNull(message = "It cannot be null.")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "person_fone", 
		joinColumns = @JoinColumn(name = "person_id"), 
		inverseJoinColumns = @JoinColumn(name = "phone_id"))
	private List<Phone> Phone;
	
	@NotNull(message = "It cannot be null.")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "person_email", 
		joinColumns = @JoinColumn(name = "person_id"), 
		inverseJoinColumns = @JoinColumn(name = "email_id"))
	private List<Email> email;
}
