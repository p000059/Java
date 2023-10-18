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
@Builder
@EqualsAndHashCode(callSuper = false)
@Table(name = "triangle")
@Entity
public class Triangle extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "angle_one")
	private int angleOne;
	
	@Column(name = "angle_two")
	private int angleTwo;
	
	@Column(name = "angle_three")
	private int angleThree;
	
	@Column(name = "side_one")
	private int sideOne;
	
	@Column(name = "side_two")
	private int sideTwo;
	
	@Column(name = "side_three")
	private int sideThree;
}
