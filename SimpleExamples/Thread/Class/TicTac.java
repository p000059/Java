package Thread.Class;

public class TicTac implements Runnable {

	Tic tic;
	Tac tac;

	Thread t;

	public TicTac(String nome, Tic tic, Tac tac) {
		this.tic = tic;
		this.tac = tac;

		t = new Thread(this, nome);
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
