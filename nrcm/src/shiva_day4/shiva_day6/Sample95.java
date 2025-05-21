package shiva_day6;
//method inner local class
public class Sample95 { //outer calss the method
	void add() {
		System.out.println("hello");
		class Test87{ //inner class inside the method
			void sub() {
				System.out.println("java");
			}
		}
		Test87 t1=new Test87(); //inner 
		t1.sub();
	}

	public static void main(String[] args) {
		Sample95 s1=new Sample95();
		s1.add();
		// TODO Auto-generated method stub

	}

}
