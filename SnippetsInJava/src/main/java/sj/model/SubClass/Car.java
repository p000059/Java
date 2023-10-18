package sj.model.SubClass;

import sj.model.ClassSuper.Vehicle;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@Table(name = "car")
@Entity
public class Car extends Vehicle {

	private static final long serialVersionUID = 1L;

	@Column(name = "trunk")
	private int trunk;
	
}
