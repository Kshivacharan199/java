package inheritence_day5;
interface I1{
	void add();
}
interface I2{
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}

public class demo_0 implements I3 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void mul() {
		System.out.println("world");
}

public static void main(String[] args) {
	demo_0	b1=new demo_0();
	b1.add();
	b1.sub();
	b1.mul();
}
}