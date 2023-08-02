package Thread.Class;

import java.sql.Date;

public class Tac {

	boolean tic;
	private Date data;

	public synchronized void tic(boolean ticExecute) {

		if (!ticExecute) { // com o tic executando, esse if não será executado.
			tic = false;
			notify();
			return;
		}

		System.out.print("\nTac");

		tic = false; // o tic sendo false, a linha abaixo será executada.

		notify(); // Após imprimir o tic, esse comando vai notificar o método tac a executar o seu
					// método.

		try {

			while (!tic) {// Enquanto for tic, será esperado a execução.
				wait();
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
