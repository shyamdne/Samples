package oop.interfaces;

 
interface Firstinterface{
	public void method();
}

	interface Secondinterface{
		public void myMethod();
	}


class DemoClass implements Firstinterface, Secondinterface {

public void method(){
	System.out.println("hmm");
}

public void myMethod(){
	
	System.out.println("hello");
}
}

public class interfaceTest {
public static void main(String[] args) {
	
	DemoClass aa=new DemoClass();
	
	aa.myMethod();
	aa.method();
}
}
	
	
	