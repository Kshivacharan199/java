package inheritence_day5;
class Animal{
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	
}
class Cat extends Animal {
	void eat() {
		System.out.println("cat is eating");
	}
}
public class demo_96 {
	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.sleep();
		c1.eat();
	}

}
