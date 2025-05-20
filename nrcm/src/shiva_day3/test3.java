package shiva_day3;

abstract class test {
	abstract void add();
}
class test3 extends test {
	public void add() {
		System.out.println("hi shiva");
	}

	public static void main(String[] args)
	{
		test3 c=new test3();
		c.add();
	}
}