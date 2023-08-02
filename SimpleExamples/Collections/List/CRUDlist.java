package Collections.List;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDlist {

	private Long id;
	private String name;
	private String age;

	public CRUDlist() {

	}

	public CRUDlist(Long id, String name, String age) {
	
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	

	public List<CRUDlist> searchNameAndReturnInList(List<CRUDlist> names, String name) {
		
		List<CRUDlist> lstNames = new ArrayList<>();
		
		CRUDlist crudList = new CRUDlist();
		
		for(int i = 0; i < names.size(); i++) {
			
			if(names.get(i).getName().equals(name)) {
				
				crudList = names.get(i);
				lstNames.add(crudList);
			}
		}
		
		return lstNames;
	}
	
	public CRUDlist updateObjCRUD(CRUDlist objCRUDlist) {
		
		CRUDlist crudList = new CRUDlist();
		
		crudList.setName(objCRUDlist.getName());
		crudList.setAge(objCRUDlist.getAge());
		
		return crudList;
	}
	
	public List<CRUDlist> listUpdate(List<CRUDlist> objList, CRUDlist objCRUdlist, Long id){
		
		List<CRUDlist> currentList = new ArrayList<>();
		
		for(int i = 0; i < objList.size(); i++) {
			
			if(objList.get(i).getId() == id) {
				
				objCRUdlist.getName();
				objCRUdlist.getAge();
				currentList.set(i, objCRUdlist);
			}
		}
		return currentList;
	}

	public void deleteItemFromList(List<CRUDlist> list, Long id){
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getId() == id) {
				
				list.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {

		CRUDlist crudList = new CRUDlist();
		List<CRUDlist> lstName = new ArrayList<>();
		List<CRUDlist> lstResult = new ArrayList<>();
		
		lstName.add(new CRUDlist(1L,"Maria","50"));
		lstName.add(new CRUDlist(2L,"Jose","55"));
		lstName.add(new CRUDlist(3L,"Ruth","30"));
		lstName.add(new CRUDlist(4L,"Joao","15"));
		lstName.add(new CRUDlist(5L,"Ruth","26"));
		
		lstResult = crudList.searchNameAndReturnInList(lstName, "Ruth");

		lstResult.forEach(s -> JOptionPane.showMessageDialog(null, "Name: " + s.getName() + "\nAge: " + s.getAge()));
		lstResult.forEach(s -> System.out.print("\n\nName: " + s.getName() + "\nAge: " + s.getAge()));

	}
}
