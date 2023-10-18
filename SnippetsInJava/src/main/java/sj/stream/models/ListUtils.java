package sj.stream.models;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class ListUtils<T> {

	private List<Integer> A;
	private List<String> B;

	public List<Integer> getA() {
		return A;
	}

	public void setA(List<Integer> a) {
		A = a;
	}

	public List<String> getB() {
		return B;
	}

	public void setB(List<String> b) {
		B = b;
	}

	public List<Integer> createListInteger() {

		this.setA(Arrays.asList(0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 8, 8, 9, 10, 10, 10, 11, 12, 13, 13, 14, 14,
				15, 16, 17, 18, 18, 19, 20, 20, 20));
		return this.getA();
	}

	public List<String> createListString() {

		this.setB(Arrays.asList("Marcelo", "Mauricio", "Ruth", "Lucas", "Bibi", "Talita", "João Victor", "Gabriel",
				"Thiago", "Taisa", "Eduarda"));
		return this.getB();
	}
}
