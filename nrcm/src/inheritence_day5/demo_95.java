package inheritence_day5;

class Animal{
	void sleep() {
		System.out.println("Dog is sleeping");
	}
}
class Dog extends Animal {
	void eat() {
		System.out.println("cat is eating");
	}
}
class Peacock extends Dog {
	void dance() {
		System.out.println("peacock is dancing");
	}
}
public class demo_95 {
	public static void main(String[] args) {
		Peacock p1=new Peacock();
		p1.sleep();
		p1.eat();
		p1.dance();
	}

}



