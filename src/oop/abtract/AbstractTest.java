package oop.abtract;
abstract class A{
	abstract void m1();
		
	
}

class B extends A{
	
	void m1() {
		
		System.out.println("hello in here");
	}
}

public class AbstractTest {
	
	public static void main(String[] args) {
		//A a = new B();
		B b = new B();
		//a.m1();
		b.m1();
	//A a = new A();	
	//a.m1();
	}
	
	

}
