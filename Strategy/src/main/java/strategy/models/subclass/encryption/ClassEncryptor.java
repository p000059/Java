package strategy.models.subclass.encryption;

import strategy.models.superclass.Common;

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
@Table(name = "class_encryptor")
@Entity
public class ClassEncryptor extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "user", length = 50)
	private String user;
	
	@Column(name = "pwd", length = 150)
	private String password;
}
