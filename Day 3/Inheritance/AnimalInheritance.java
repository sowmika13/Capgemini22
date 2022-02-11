package Inheritance;

class Animal {
	void eat() {
		System.out.println("Animal Eats");
	}
	
	void sleep() {
		System.out.println("Animal Sleeps");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Bird Eats");
	}
	void sleep() {
		System.out.println("Bird sleeps");
	}
	void fly() {
		System.out.println("Bird flies");
	}
}
public class AnimalInheritance {
	public static void main(String args[]) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
		//a.fly();
	}

}

