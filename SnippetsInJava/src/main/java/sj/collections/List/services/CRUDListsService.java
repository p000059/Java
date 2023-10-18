package sj.collections.List.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sj.collections.List.classes.CRUDlists;

@AllArgsConstructor
@Service
public class CRUDListsService {
	
	public List<CRUDlists> returnList() {

		List<CRUDlists> listNames = new ArrayList<>();

		return listNames.stream().sorted().collect(Collectors.toList());
	}

	public List<CRUDlists> returnListName(List<CRUDlists> sourceList, String name) {

		return sourceList.stream().filter(p -> p.getName() == name).collect(Collectors.toList());
	}
	
	public List<CRUDlists> returnListAge(List<CRUDlists> sourceList, String age){
		
		return sourceList.stream().filter(p -> p.getAge() == age).collect(Collectors.toList());
	}
	
	public Optional<CRUDlists> returnObject(List<CRUDlists> sourceList, String name) {
		
		Optional<CRUDlists> resultList = sourceList.stream().filter(p -> p.getName() == name).findFirst();
		
		return resultList;
	}

	public List<CRUDlists> searchNameAndReturnList(List<CRUDlists> names, String name) {

		List<CRUDlists> lstNames = new ArrayList<>();

		CRUDlists crudList = new CRUDlists();

		for (int i = 0; i < names.size(); i++) {

			if (names.get(i).getName().equals(name)) {

				crudList = names.get(i);
				lstNames.add(crudList);
			}
		}

		return lstNames;
	}

	public CRUDlists updateObjCRUD(CRUDlists objCRUDlist) {

		CRUDlists crudList = new CRUDlists();

		crudList.setName(objCRUDlist.getName());
		crudList.setAge(objCRUDlist.getAge());

		return crudList;
	}

	public List<CRUDlists> listUpdate(List<CRUDlists> objList, CRUDlists objCRUdlist, Long id) {

		List<CRUDlists> currentList = new ArrayList<>();

		for (int i = 0; i < objList.size(); i++) {

			if (objList.get(i).getId() == id) {

				objCRUdlist.getName();
				objCRUdlist.getId();
				currentList.set(i, objCRUdlist);
			}
		}

		return currentList;
	}

	public void deleteItemFromList(List<CRUDlists> list, Long id) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getId() == id) {

				list.remove(i);
			}
		}
	}
}
