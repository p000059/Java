package Persistence.models.intermediate;

import java.io.Serializable;

import Persistence.models.Embbedable.PersonPhoneId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Table(name = "person_phone")
@Entity
@IdClass(PersonPhoneId.class)
public class PersonPhone implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "person_id")
	private Long personId;

	@Id
	@Column(name = "phone_id")
	private Long phoneId;
}
