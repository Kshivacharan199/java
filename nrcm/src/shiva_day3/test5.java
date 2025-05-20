package shiva_day3;

abstract class test4 { 
	abstract void add();
	abstract void sub();
	static void div() {
		System.out.println("division");
	}
	void mul() {
		System.out.println("multipilcation");
		
	}
	void mod() {
		System.out.println("modulus");
	}
}
	class test6 extends test4 {
		void add() {
			System.out.println("addition");
	}
		void sub() {
			System.out.println("substraction");
		}
	}
	class test5
		
		{
	public static void main(String[] args) {
		test6 t=new test6();
		t.add();
		t.sub();
		test4.div();
		t.mul();
		t.mod();
	}

}
