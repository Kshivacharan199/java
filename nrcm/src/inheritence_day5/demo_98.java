package inheritence_day5;
class sample35{
	public sample35() {
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}
public class demo_98 extends sample35{
	public demo_98() {
		
		super();
	}
	void show () {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[]args) {
		demo_98 d=new demo_98();
		d.show();
	}
	
}




