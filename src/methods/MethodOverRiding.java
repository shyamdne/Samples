package methods;

public class MethodOverRiding {

	public static void main(String[] args) {
		
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.makeSound();
		animal2.makeSound();
		System.out.println("----------====");
		
		Dog d = new Dog ();
		Cat c = new Cat();
		
		d.makeSound();
		c.makeSound();
		System.out.println("----------====");
		
	}
	
	
	}

class  Animal{
	
	void makeSound() {
		System.out.println("Animal make Sound");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("dog bow bow bow");
	}
	
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("cat mew mew mew ");
	}
	
}