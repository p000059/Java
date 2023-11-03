package ic.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Entity
@Table(name = "tax")
public class Tax implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private Long id;
	
	@Column(name = "type", length = 50, nullable = false)
	private String type;
	
	@Column(name = "model", length = 40, nullable = true)
	private String model;
	
	@Column(name = "code", length = 10, nullable = false)
	private String code;
	
	@Column(name = "manufacturer", length = 50,  nullable = true)
	private String manufacturer;
	
	@Column(name = "tax", nullable = false)
	private Double tax;
	
	@Column(name = "status", nullable = false)
	private Boolean status;
}
