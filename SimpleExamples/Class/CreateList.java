package CRUD.Class;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CreateList {
	
	private int option;
	private ArrayList<String> listName = new ArrayList<>();
	
	public CreateList() {
		super();
	}

	public CreateList(ArrayList<String> listName) {
		super();
		this.listName = listName;
	}

	public ArrayList<String> getListName() {
		return listName;
	}

	public void setListName(ArrayList<String> listName) {
		this.listName = listName;
	}
	
	
	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	protected void createArray() {
		
			this.listName.add(JOptionPane.showInputDialog("Digite o nome: "));
			this.showMenu();
	}
	
	protected void createArray(ArrayList<String> listName) {
	
			listName.add(JOptionPane.showInputDialog("Digite o nome: "));
			this.showMenu();
	}
	
	protected void menuOperation() {
		
		switch(this.getOption()){
		
		case 1:
			
			this.createArray();
			break;
		
		case 2:
			
			this.showList();
			break;
		
		case 3:
			
			this.updateItemList();
			break;
		
		case 4:
			
			this.deleteItemList();
			break;
			
		case 5:
			
			this.clearList();
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Saindo...");
			break;
		}
		
		
		
	}
	
	public void showMenu() {

		do {
			
			this.setOption(Integer.parseInt(JOptionPane.showInputDialog("Digite: "
					+ "\n1 - Cadastrar Nome "
					+ "\n2 - Mostrar Nomes "
					+ "\n3 - Atualizar Nome"
					+ "\n4 - Apagar um nome"
					+ "\n5 - Limpar a lista"
					+ "\n6 - Sair ")));
			this.menuOperation();
			
		}while((this.getOption() > 0) && (this.getOption() < 6));
		
	}
	
	public ArrayList<String> readList(){
		return this.getListName();
	}
	
	protected void showList(){
		this.getListName()
			.stream()
			.forEach(n -> JOptionPane.showMessageDialog(null, "List [" + n + "]"));
	}
	
	protected void updateItemList(){
		
		int position = Integer.parseInt(JOptionPane.showInputDialog("Indique a posição: "));
		String name = JOptionPane.showInputDialog("Entre com o nome a ser substituído: ");
		this.listName.set(position, name);						
	}
	
	protected void deleteItemList() {
		
		int position = Integer.parseInt(JOptionPane.showInputDialog("Entre com a posição a ser removida: "));
		this.listName.remove(position);
	}
	
	protected void clearList() {
		
		Object[] options = {"Yes", "No"};
		JOptionPane.showOptionDialog(null, "Apagar conteúdo o Array", null, JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		
		if(options[0].equals("Yes")) {
			this.getListName().clear();
		}
		else if(options[0] == "No") {
			this.showMenu();
		}
		else {
			JOptionPane.showMessageDialog(null, "Opção Invalida!");
		}
	}
}
