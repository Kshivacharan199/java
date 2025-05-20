package inheritence_day5;
interface I9{
	void add(); 
		interface I1{
			void sub(); 
				
			}
		
	}


public class demo_1 implements I9,I1 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		demo_1	t1=new demo_1();
		t1.add();
		t1.sub();
		

	}
	

}
