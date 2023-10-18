package sj.model.SubClass;

import sj.model.ClassSuper.Common;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

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
@Table(name = "produto")
@Entity
public class Produto extends Common {

	private static final long serialVersionUID = 1L;

	public enum Status {
		ATIVO, INATIVO
	}

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private Status status;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "category")
	private Category category;

	public void inactivate() {

		JOptionPane.showMessageDialog(null, "inactivated " + this.getName());
		this.status = Status.INATIVO;
	}
}
