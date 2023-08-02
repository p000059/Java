package Collections.List;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SearchShowList {

	public Integer findIntegerList(List<Integer> A, int number) {

		Integer foundNumber = 0;

		for (int i = 0; i < A.size(); i++) {

			if (number == i) {
				
				foundNumber = A.get(i).hashCode();
			}
		}

		return foundNumber;
	}

	public int findIntList(List<Integer> A, int number) {

		int foundNumber = 0;

		for (Integer i : A) {

			if (number == i.hashCode()) {
				
				foundNumber = i.hashCode();
			}
		}

		return foundNumber;
	}

	public void showListFor(List<Integer> A) {

		System.out.println("\nShow List\n");

		for (int i = 0; i < A.size(); i++) {

			System.out.print("[" + A.get(i).hashCode() + "]");
		}

		System.out.println();
	}

	public void showListForIn(List<Integer> A) {

		System.out.println("\nSecond Example\n");

		for (Integer i : A) {

			System.out.print("[" + i + "]");
		}

		System.out.println();
	}

	public static void main(String[] args) {

		List<Integer> listInteger = new ArrayList<>();
		SearchShowList simpleList = new SearchShowList();

		listInteger.add(3);
		listInteger.add(5);
		listInteger.add(6);
		listInteger.add(9);
		listInteger.add(1);
		listInteger.add(8);
		listInteger.add(2);
		listInteger.add(7);
		listInteger.add(0);
		listInteger.add(4);

		System.out.println();

		for (int i = 0; i < listInteger.size(); i++) {

			System.out.print("\nLista<Integer> A = { " + listInteger.get(i) + " }");
		}

		System.out.println();

		simpleList.showListFor(listInteger);

		simpleList.showListForIn(listInteger);
		
		JOptionPane.showMessageDialog(null, simpleList.findIntList(listInteger, 8));
		

	}
}
