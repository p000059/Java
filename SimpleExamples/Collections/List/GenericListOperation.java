package Collections.List;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GenericListOperation<T> {

	private List<T> lstObj;

	public List<T> getLstObj() {
		return lstObj;
	}

	public void setLstObj(List<T> lstObj) {
		this.lstObj = lstObj;
	}

	public GenericListOperation() {
	}

	public GenericListOperation(List<T> lstObj) {
		this.lstObj = lstObj;
	}

	public void createList(List<T> lstCreated, T obj) {
		lstCreated.add(obj);
	}

	public void readListFor(List<T> lstItem) {

		for (int i = 0; i < lstItem.size(); i++) {

			JOptionPane.showMessageDialog(null, "List[" + lstItem.get(i) + "]");
		}
	}

	public void readListLambda(List<T> lstItem) {

		lstItem.forEach((obj) -> {

			JOptionPane.showMessageDialog(null, "List [" + obj + "]");
		});
	}

	public void readListForeach(List<T> lstItem) {

		for (T obj : lstItem) {

			JOptionPane.showMessageDialog(null, "List [" + obj + "]");
		}
	}

	public T readItemList(List<T> lstItem, T obj) {

		T objResult = null;

		for (int i = 0; i < lstItem.size(); i++) {

			if (lstItem.get(i) == obj) {

				objResult = obj;
				break;
			}
		}

		return objResult;
	}

	public T updateItemList(List<T> lstItem, T obj) {

		T resultObj = null;

		for (int i = 0; i < lstItem.size(); i++) {

			if (lstItem.contains(obj)) {

				resultObj = lstItem.set(i, obj);
			}

		}
		return resultObj;
	}

	@SuppressWarnings("unused")
	public String removeItemList(List<T> lstItem, T obj) {

		for (int i = 0; i < lstItem.size(); i++) {

			if (lstItem.contains(obj)) {

				lstItem.remove(obj);
				break;

			} else {

				return "Item not removed";
			}
		}

		return "Item removed sussessfully";
	}

	public static void main(String[] args) {

		int size = 5;
		List<Integer> listArray = new ArrayList<>();
		GenericListOperation<Integer> arrayListMethods = new GenericListOperation<>();

		for (int i = 0; i < size; i++) {

			listArray.add(i, 20 * i);
		}

		arrayListMethods.setLstObj(listArray);

		JOptionPane.showMessageDialog(null,
				"Value: " + arrayListMethods.readItemList(arrayListMethods.getLstObj(), 40));

		arrayListMethods.removeItemList(arrayListMethods.getLstObj(), 40);

		for (Integer objInteger : arrayListMethods.getLstObj()) {

			JOptionPane.showMessageDialog(null, objInteger);
		}
	}
}
