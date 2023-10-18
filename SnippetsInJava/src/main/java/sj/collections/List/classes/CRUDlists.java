package sj.collections.List.classes;

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
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "crud_list")
@Entity
public class CRUDlists extends Common {

	private static final long serialVersionUID = 1L;

	@Column(name = "name", length = 20)
	private String name;

	@Column(name = "age", length = 2)
	private String age;

	
}
