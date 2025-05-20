package shiva_day4;

public class test9 {
	int a=96;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test9 t=new test9();
t.sub();
	}

}
