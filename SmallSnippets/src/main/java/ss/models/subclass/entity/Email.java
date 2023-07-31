package ss.models.subclass.entity;

import ss.models.superclass.Common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "email")
@Entity
public class Email extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "address", length = 150, unique = true, nullable = false)
	private String address;
}
