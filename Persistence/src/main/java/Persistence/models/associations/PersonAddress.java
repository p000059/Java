package Persistence.models.associations;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Table(name = "person_address")
@Entity
public class PersonAddress implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "person_id")
	private Long personId;
	
	@Id
	@Column(name = "address_id")
	private Long addressId;
}
