package shiva_day6;

public class sample96 {
	void show() {
		System.out.println("hai");
		
	}
	class test96 {
		void display() {
			System.out.println("java");
		}
	}

	public static void main(String[] args) {
		sample96 s1=new sample96();
		s1.show();
		sample96.test96 t1=new sample96().new test96();
		t1.display();
		
	}

}
