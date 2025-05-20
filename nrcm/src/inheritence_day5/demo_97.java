package inheritence_day5;
class Fruits {
	void benifits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits {
	void color() {
		System.out.println("Apple is red");
		
	}
}
class Banna extends Fruits {
	void taste(){
		System.out.println("Banna is a sweet");
	}
}
class Mango extends Fruits{
	void price(){
		System.out.println("Mango price is 999");
	}
}
public class demo_97 {
	public static void main(String[] args) {
		Apple a1=new Apple();
		a1.color();
		Banna b1=new Banna();
		b1.taste();
		Mango m1=new Mango();
		m1.price();
	}

}
