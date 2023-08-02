package Collections.Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import javax.swing.JOptionPane;

public class MapHashTable {

	private String name;
	private String lastName;
	
	public MapHashTable () {
		
	}
	
	public MapHashTable(String name) {
		this.name = name;
	}
	
	public MapHashTable(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapHashTable other = (MapHashTable) obj;
		return Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}
	
	public Map<Integer, MapHashTable> updateMap(Map<Integer, MapHashTable> sourceMap, Integer key){
		
		Map<Integer, MapHashTable> outPutMap = new Hashtable<>();
		
		for(int i = 1; i < sourceMap.size()+1; i++) {
			
			if(sourceMap.containsKey(key)) {
				
//				sourceMap.put(key);
			}
		}
		
		return outPutMap;
	}

	public Map<Integer, MapHashTable> updateItem(Map<Integer, MapHashTable> sourceMap, Integer key, MapHashTable object){
		
		Map<Integer, MapHashTable> outPutMap = new Hashtable<>();
		
		for(int i = 1; i < sourceMap.size()+1; i++) {
			
			if(sourceMap.containsKey(key)) {
				
				sourceMap.put(key, object);
			}
		}
		
		return outPutMap;
	}
	
	public Map<Integer, String> updatePrimitiveItem(Map<Integer, String> sourceMap, Integer key, String item){
		
		for(int i = 1; i < sourceMap.size()+1; i++) {
			
			if(sourceMap.containsKey(key)) {
				
				sourceMap.replace(key, item);
			}
		}
		
		return sourceMap;
	}
	
	public Map<Integer, MapHashTable> updatePrimitiveObjectItem(Map<Integer, MapHashTable> sourceMap, Integer key, MapHashTable item){
		
		for(int i = 1; i < sourceMap.size()+1; i++) {
			
			if(sourceMap.containsKey(key)) {
				
				sourceMap.replace(key, item);
			}
		}
		
		return sourceMap;
	}
	
	public Map<Integer, MapHashTable> removeItem(Map<Integer, MapHashTable> sourceMap, Integer key, MapHashTable item){
		
		for(int i = 1; i < sourceMap.size()+1; i++) {
			
			if(sourceMap.containsKey(key) && sourceMap.containsValue(item)) {
				
				sourceMap.remove(key);
			}
		}
		
		return sourceMap;
	}
	
	public static void main(String[] args) {
		
		MapHashTable mapHashTable = new MapHashTable();
		Map<Integer, MapHashTable> ht = new Hashtable<>();
		
		ht.put(1, new MapHashTable("Mauricio", "Guimba"));
		ht.put(2, new MapHashTable("Marcelo", "Guimba"));
		ht.put(3, new MapHashTable("Lucas", "Guimba"));
		ht.put(4, new MapHashTable("Ruth", "Guimba"));
		ht.put(5, new MapHashTable("Joao", "Guimba"));
		ht.put(6, new MapHashTable("Gabriel", "Guimba"));
		ht.put(7, new MapHashTable("Thiago", "Guimba"));
		ht.put(8, new MapHashTable("Alguem", "Guimba"));
		ht.put(9, new MapHashTable("Alguem","Guimba"));
		
		for(int i = 1; i < ht.size()+1; i++) {
			
			JOptionPane.showMessageDialog(null, "Name: " + ht.get(i).getName() + "\nLastName: " + ht.get(i).getLastName());
		}
		          
		mapHashTable.setName("Taisa");
		mapHashTable.setLastName("Guimba");
		
		Map<Integer, MapHashTable> outPutMap = mapHashTable.updatePrimitiveObjectItem(ht, 8, mapHashTable);
		
		for(int i = 1; i < outPutMap.size()+1; i++) {
			
			JOptionPane.showMessageDialog(null, "Name: " + ht.get(i).getName() + "\nLastName: " + ht.get(i).getLastName());			
		}
		
			
		mapHashTable.removeItem(ht, 9, mapHashTable);
		
		
	}
}
