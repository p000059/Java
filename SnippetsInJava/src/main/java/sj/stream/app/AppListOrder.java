package sj.stream.app;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import sj.stream.models.ListUtils;
import sj.stream.service.ListOrder;

public class AppListOrder {

	public static void main(String[] args) {

		ListUtils<Integer> cliac = new ListUtils<>();
		ListOrder listOrder = new ListOrder();
		List<Integer> lstInt = new ArrayList<>();

		lstInt = cliac.createListInteger();

		for (Integer obj : listOrder.listOrder(lstInt)) {

			JOptionPane.showMessageDialog(null, "Value: " + obj);
		}
	}
}
