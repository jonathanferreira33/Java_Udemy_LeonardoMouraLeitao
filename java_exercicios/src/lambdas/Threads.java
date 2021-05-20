package lambdas;

public class Threads {
	
	public static void main(String[] args) {
		
		// modo 1
		Runnable trabalho1 = new Trabalho1();
		
		// modo 2
		Runnable trabalho2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #02");
					
					try {
						Thread.sleep(i);
					} catch (Exception e) {
						
					}
				}				
			}
		};
		
		// modo 3 com lambda
		Runnable trabalho3 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Tarefa #03");
				
				try {
					Thread.sleep(i);
				} catch (Exception e) {
					
				}
			}		
		};
		
		// modo 4 com lambda
		Runnable trabalho4 = Threads::trabalho4;
		
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		Thread t4 = new Thread(trabalho4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	
	static void trabalho4() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #04");
			
			try {
				Thread.sleep(i);
			} catch (Exception e) {
				
			}
		}		
	}
}
