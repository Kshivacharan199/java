package inheritence_day5;
class Movies{
	void genre() {
		System.out.println("crime and murder");
				
	}
}
class Hit extends Movies {
	void action() {
		System.out.println("Investigation");
	}
}
class Hero extends Movies{
	void acting() {
		System.out.println("Nithin");
	}
}
class Heronie extends Movies{
	void acting() {
		System.out.println("sai prasana is hot");
	}
	
}

public class demo_94 {
	public static void main(String[] args) {
		Hero h1=new Hero();
		Hit h2=new Hit();
		Heronie h3=new Heronie();
		h1.genre();
		h1.acting();
		h2.action();
		h3.acting();
		
	}

}
