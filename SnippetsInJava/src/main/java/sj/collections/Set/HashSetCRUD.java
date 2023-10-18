package sj.collections.Set;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class HashSetCRUD {

	private HashSet<String> list;

	public HashSet<String> createItem(String object) {

		HashSet<String> list = new HashSet<>();

		list.add(object);

		return list;
	}

	public Set<String> updateItem(Set<String> list, String item, String current) {

		for (int i = 1; i < list.size() + 1; i++) {

			if (list.contains(item)) {

				list.remove(item);
				list.add(current);
			}
		}

		return list;
	}

	public Set<String> removeItem(Set<String> list, String item) {

		for (int i = 1; i < list.size() + 1; i++) {

			if (list.contains(item)) {

				list.remove(item);
			}
		}
		
		return list;
	}

	public static void main(String[] args) {

		HashSetCRUD hashSetCRUD = new HashSetCRUD();
		HashSet<String> sourceList = new HashSet<>();

		sourceList.add("Marcelo");
		sourceList.add("Mauricio");
		sourceList.add("Marlucia");
		sourceList.add("Marlene");
		sourceList.add("Marilene");
		sourceList.add("Maria");
		sourceList.add("Marcos");
		sourceList.add("Martinez");
		sourceList.add("Marta");
		sourceList.add("Milena");
		sourceList.add("Lucas");
		sourceList.add("Ludmila");

		hashSetCRUD.setList(sourceList);

		hashSetCRUD.updateItem(hashSetCRUD.getList(), "Marilene", "Nubiane")
		.stream()
		.sorted()
		.forEach(p -> System.out.println("Value: " + p));
	}

}
