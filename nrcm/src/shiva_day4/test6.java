package shiva_day4;

public class test6 {
	int a;
	int b;
	public test6(int X,int Y) {
		a=X;
		b=Y;
	
	}
	public void add() {
		System.out.println(this.a+this.b);
	}
	public static void main(String[]args) {
	test6 t=new test6(10,14);
	t.add();
}
}
