package Collections.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class MapGeneric<T, V> {

	private HashMap<T, V> sourceList;

	public MapGeneric() {

	}

	public MapGeneric(HashMap<T, V> sourceList) {
		super();
		this.sourceList = sourceList;
	}

	public HashMap<T, V> getSourceList() {
		return sourceList;
	}

	public void setSourceList(HashMap<T, V> sourceList) {
		this.sourceList = sourceList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sourceList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapGeneric other = (MapGeneric) obj;
		return Objects.equals(sourceList, other.sourceList);
	}

	public HashMap<T, V> createItem(T key, V object) {

		HashMap<T, V> list = new HashMap<>();

		list.put(key, object);

		return list;
	}

	public HashMap<T, V> updateItem(HashMap<T, V> list, T key, V item){
		
		for(int i = 1; i < list.size()+1; i++) {
			
			if(list.get(i).equals(list.get(key))) {
				
				list.put(key, item);
			}
		}
		
		return list;
	}
	
	public HashMap<T, V> removeItem(HashMap<T, V> names, T item) {
		
		names.remove(item);
		
		return names;
	}
	
	public static void main(String[] args) {

		MapGeneric<Integer, String> generic = new MapGeneric<>();
		HashMap<Integer, String> sourceList = new HashMap<>();
		
		sourceList.put(1, "Marcelo");
		sourceList.put(2, "Mauricio");
		sourceList.put(3, "Marlucia");
		sourceList.put(4, "Marlene");
		sourceList.put(5, "Marilene");
		sourceList.put(6, "Maria");
		sourceList.put(7, "Marcos");
		sourceList.put(8, "Martinez");
		sourceList.put(9, "Marta");
		sourceList.put(10,"Milena");
		sourceList.put(11,"Lucas");
		sourceList.put(12,"Ludmila");
		
		generic.setSourceList(sourceList);
		
		generic.updateItem(sourceList, 5, "Nubiane");
		
		JOptionPane.showMessageDialog(null, generic.getSourceList());
	}

}
