package Mutithreading;

public class A {
	
	
	public static void main(String[] args) {
		Runnable r= new Thread ();
		ThreadGroup threadGroup = new ThreadGroup("java");
		Thread t = new Thread(threadGroup, r);
		System.out.println(t);
		
	}

}
