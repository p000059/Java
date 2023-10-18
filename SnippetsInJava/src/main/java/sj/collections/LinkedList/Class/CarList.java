package sj.collections.LinkedList.Class;

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
@Table(name = "car_list")
@Entity
public class CarList extends Common {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "car", length = 25)
	private String car;
}
