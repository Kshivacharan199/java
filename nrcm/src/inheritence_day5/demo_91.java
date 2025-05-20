package inheritence_day5;
interface I1 {
	void add();
	void sub();
}
public class  demo_91 implements I1{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello shiva");
	}

	public static void main(String[] args) {
		 demo_91 d1=new  demo_91();
		 d1.add();
         d1.sub();
	}

}
