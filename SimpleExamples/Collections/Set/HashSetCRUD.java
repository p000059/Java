package Collections.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.swing.JOptionPane;

public class HashSetCRUD {

	private HashSet<String> list;

	public HashSetCRUD() {

	}

	public HashSetCRUD(HashSet<String> list) {
		super();
		this.list = list;
	}

	public HashSet<String> getList() {
		return list;
	}

	public void setList(HashSet<String> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSetCRUD other = (HashSetCRUD) obj;
		return Objects.equals(list, other.list);
	}

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
