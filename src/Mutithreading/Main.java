package Mutithreading;

public class Main {
	
	public static void main(String[] args) {
		
		WelcomeThread welcomeThread = new WelcomeThread();
		welcomeThread.start();
		for (int i = 0; i < 10; i++) {

			System.out.println("mainthread   :"+i);
		}
		
		
	}

}
