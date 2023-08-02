package Thread.Class;

public class Tic {

	boolean tic;

	public synchronized void tic(boolean ticExecute) {

		if (!ticExecute) { // com o tic executando, esse if não será executado.
			tic = true;
			notify();
			return;
		}

		System.out.print("Tic");

		tic = true; // o tic sendo true, a linha abaixo será executada.

		notify(); // Após imprimir o tic, esse comando vai notificar o método tac a executar o seu
					// método.

		try {

			while (tic) {// Enquanto for tic, será esperado a execução.
				wait();
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
