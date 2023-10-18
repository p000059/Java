package sj.model.SubClass;

import sj.model.ClassSuper.Common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
@Table(name = "fone")
@Entity
public class Fone extends Common{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "ddi")
	private String ddi;
	
	@Column(name = "ddd")
	private String ddd;
}
