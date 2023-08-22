package oop.abtract;
//without abstract method is in abstract class
abstract class E{
	void m1() {
		System.out.println("m1-A");
	}
	
	void m2() {
		System.out.println("m2-A");
	}
	
	void m3() {
		System.out.println("m3-A");
		
	}
	
}
class D extends E{
	
}

public class AbstractClass {

	public static void main(String[] args) {
		
		E a = new  D();
		a.m1();
		a.m2();
		a.m3();
		
		
		
	}
	
}
