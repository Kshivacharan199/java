package inheritence_day5;

 class demo{
	void add() {
		System.out.println("hi");
	}
}
// runtime polymorprisam
public class demo_92 extends  demo {
	void add() {
		System.out.println("hello shiva");
	}

	public static void main(String[] args) {
		demo_92 d1=new demo_92();
		d1.add();

	}
}


