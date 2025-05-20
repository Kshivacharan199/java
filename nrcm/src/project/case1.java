package project;
interface I1{
	void add();
}
interface I2{
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}

public class case1 implements I3 {
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
	case1 b1=new case1();
	b1.add();
	b1.sub();
	b1.mul();
}
}
