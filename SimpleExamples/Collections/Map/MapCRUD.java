package Collections.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class MapCRUD {
	
	private Map<Integer, String> listItem;
	
	public MapCRUD() {
		
	}

	public MapCRUD(Map<Integer, String> listItem) {
		super();
		this.listItem = listItem;
	}
	
	public Map<Integer, String> getListItem() {
		return listItem;
	}
	
	public void setListItem(Map<Integer, String> listItem) {
		this.listItem = listItem;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(listItem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapCRUD other = (MapCRUD) obj;
		return Objects.equals(listItem, other.listItem);
	}
	
	@Override
	public String toString() {
		return "\nlistItem = [" + listItem + "]";
	}

	public Map<Integer, String> createItem(Integer key, String object){
		
		Map<Integer, String> list = new HashMap<>();
		
		list.put(key, object);
		
		return list;
	}
	
	public void showInFor(Map<Integer, String> list) {

		for (int i = 0; i < list.size() + 1; i++) {

			System.out.print("\nValue[" + i + "] = " + list.get(i));
		}
	}

	public void showInForeach(Map<Integer, String> list) {

		int j = 1;

		for (String obj : list.values()) {

			System.out.print("\nValue[" + j + "] = " + obj);
			j++;
		}
	}
	
	public Map<Integer, String> updateItem(Map<Integer, String> list, Integer key, String item){
		
		for(int i = 1; i < list.size()+1; i++) {
			
			if(list.get(i).equals(list.get(key))) {
				
				list.replace(key, item);
			}
		}
		
		return list;
	}

	public Map<Integer, String> removeItem(Map<Integer, String> names, Integer item) {
		
		names.remove(item);
		
		return names;
	}

	public Map<Boolean, List<Integer>> mapBooleanAndList(List<Integer> sourceList) {
		
		Map<Boolean, List<Integer>> outPutMap = sourceList.stream()
				.distinct() 
				.collect(Collectors.groupingBy(e -> e % 2 == 0));
		
		return outPutMap;
	}

	public Map<Integer, List<Integer>> mapDistinctGroupingBy(List<Integer> sourceList) {
		
		Map<Integer, List<Integer>> outPutMap = sourceList.stream()
				.distinct() 
				.collect(Collectors.groupingBy(e -> e % 3));
		
		return outPutMap;
	}

	public Map<Boolean, List<Integer>> GroupEvenAndOdd(List<Integer> sourceList) {

		/*
		 * (groupingBy('lambda')) Returns a Collector implementing a "group by" operation on
		 * input elements of type Integer, grouping elements according to a
		 * classification function, and returning the results in a Map.
		 */
		
		Map<Boolean, List<Integer>> outPutList = sourceList.stream()
				.collect(Collectors.groupingBy(e -> e % 2 == 0));

		return outPutList;
	}
	
	public static void main(String[] args) {

		MapCRUD mapCRUD = new MapCRUD();
		Map<Integer, String> sourceList = new HashMap<>();

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
		sourceList.put(13,"Ludmila"); //HashMap allows duplicate records.
		
		mapCRUD.setListItem(sourceList);
		
		mapCRUD.updateItem(sourceList, 4, "Luana");
		mapCRUD.updateItem(sourceList, 5, "Nubiane");

		JOptionPane.showMessageDialog(null, mapCRUD.getListItem().toString());
	}

}
