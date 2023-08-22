package oop.abtract;
abstract class Gangadhar{
	abstract void m1();
	abstract void m2();
	abstract void m3();

}

abstract class Shyam extends Gangadhar{
	void m1() {
		System.out.println("m1_b");
	}
	
}
class Chinni extends Shyam{
	
	void m2() {
		System.out.println("m2-c");
	}
	void m3() {
		System.out.println("m3-c");
	}
}

public class NoImpAbstractmethod{
public static void main(String[] args) {
	Gangadhar g= new Chinni();
	g.m1();
	g.m2();
	g.m3();	
	
}
}
