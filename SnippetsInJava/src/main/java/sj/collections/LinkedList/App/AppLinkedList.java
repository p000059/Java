package sj.collections.LinkedList.App;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import sj.collections.LinkedList.Class.CarList;


public class AppLinkedList {

	public static void main(String[] args) {
		
		LinkedList<CarList> listCar = new LinkedList<>();
		
		String[] cars = new String[8];
		cars[0] = "Dodge";
		cars[1] = "BMW";
		cars[2] = "Ferrari";
		cars[3] = "Bugatti";
		cars[4] = "Lamborguini";
		cars[5] = "Masserati";
		cars[6] = "Audi";
		cars[7] = "Mitsubishi";
		
		
		for(int i = 0; i < cars.length; i++) {
			
			listCar.add(new CarList(cars[i]));
		}
		
		listCar.addLast(new CarList(cars[7] = "Ford"));
		
//		listCar.addLast("Ford");
		
		for(CarList objCar: listCar) {
			
			System.out.println("Car: " + objCar.getCar());
		}
		
		JOptionPane.showMessageDialog(null, listCar.getFirst().getCar());
//		listCar.removeFirst();
		
		
	}	
}
