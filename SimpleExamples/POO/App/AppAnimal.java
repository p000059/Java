package POO.App;

import javax.swing.JOptionPane;

import POO.Class.Bull;
import POO.Class.Cat;
import POO.Class.Dog;
import POO.Enumerator.AnimalStatus;

public class AppAnimal {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bull ox = new Bull();
		
		cat.setName("Xanim");
		cat.setColor("Black");
		cat.setBreed("Birmanês");
		cat.setaStatus(AnimalStatus.ACTIVE.getValue());
		
		dog.setName("Totó");
		dog.setColor("Cinza");
		dog.setPressionBite("406PSI");
		dog.setaStatus(AnimalStatus.ACTIVE.getValue());
		
		ox.setName("Mimoso");
		ox.setColor("Malhado");
		ox.setWeight("1500kg");
		ox.setaStatus(AnimalStatus.ACTIVE.getValue());
		
		JOptionPane.showMessageDialog(null, 
				cat.toString()
				+ dog.toString()
				+ ox.toString()
		);
	}
}
