package oop.interfaces;

import javax.swing.event.AncestorEvent;

class Animal{
	
	public void animalSound() {
		System.out.println("animal makes sounds");
	}
}

class Pig extends Animal{
 public void animalSound(){
	 
	 System.out.println("zooo");
 }
}

class Cow extends Animal{
	
	public void animalSound() {
		System.out.println("mooo moo");
		
		
	}
	
	
}



public class PolymorphismTEst {
public static void main(String[] args) {
	
	
	Animal a = new Animal();
	Animal p= new Pig ();
	Animal c= new Cow();
	
	
	a.animalSound();
	p.animalSound();
	c.animalSound();
	
}
}
