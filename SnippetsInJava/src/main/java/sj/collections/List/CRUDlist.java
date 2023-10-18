package sj.collections.List;

import sj.collections.List.classes.CRUDlists;
import sj.collections.List.services.CRUDListsService;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUDlist {

	public static void main(String[] args) {

		CRUDListsService crudListsService = new CRUDListsService();

		List<CRUDlists> lstName = new ArrayList<>();
		List<CRUDlists> lstResult = new ArrayList<>();

		lstName.add(new CRUDlists("Maria", "50"));
		lstName.add(new CRUDlists("Jose", "55"));
		lstName.add(new CRUDlists("Ruth", "30"));
		lstName.add(new CRUDlists("Joao", "15"));
		lstName.add(new CRUDlists("Ruth", "26"));

		lstResult = crudListsService.searchNameAndReturnList(lstName, "Maria");

		lstResult.forEach(s -> JOptionPane.showMessageDialog(null, "Name: " + s.getName() + "\nAge: " + s.getId()));
		lstResult.forEach(s -> System.out.print("\n\nName: " + s.getName() + "\nAge: " + s.getId()));

	}
}
