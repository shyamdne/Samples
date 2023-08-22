package Mutithreading;

public class TestRunnable {
	
	
		public static void main(String[] args) {
			MultiThreadingRunnable multiThreadingRunnable = new MultiThreadingRunnable();
			Thread t = new Thread(multiThreadingRunnable);
			t.start();
			for(int i =0; i<10; i++) {
				System.out.println("main thread");

		}
		
	} 
	}
	


