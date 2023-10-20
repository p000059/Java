package Thread.App;

public class ThreadCounter {
	
	static int i = 0;

	public static void main(String[] args) {
		
		new Thread(t1).start();
		new Thread(t2).start();
		
	}
	
	private static void count(String name) {
		
		i++;
		System.out.println("\nO valor do contador atual é: " + i + ", thread: " + name);
		
	}
	
	private static Runnable t1 = new Runnable() {
		
		@Override
		public void run() {

			try {
				
				for(int i = 0; i < 5; i++) {
					
					count("t1");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	};
	
	private static Runnable t2 = new Runnable() {
		
		
		public void run() {
			
			try {
				
				for(int i = 0; i < 5; i++) {
					
					count("t2");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	};

}
