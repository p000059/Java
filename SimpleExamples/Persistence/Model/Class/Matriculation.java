package Persistence.Model.Class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "matriculation")
@Entity
public class Matriculation {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "date_matriculation")
	private String name;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;

	 @ManyToOne
	 @JoinColumn(name = "student_id")
	 private Student student;

	 @OneToOne(mappedBy = "matriculation")
	 private Payment payment;
}
