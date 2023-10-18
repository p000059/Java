package sj.collections.List.classes;

import sj.model.ClassSuper.Common;
import sj.model.SubClass.Product;

import java.util.List;

import jakarta.persistence.Column;
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
@Table(name = "product_catalog")
public class Catolog extends Common {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "product_catalog")
	private List<Product> produtoCatalogo;
}
