package project;
interface A1{
	void add();
}
interface A2 extends A1{
	void sub();

}

 class shiva1 implements A2  {
	public void add() {
		System.out.println("Well");
	}
	public void sub() {
		System.out.println("Come to");
	}
	public void mul() {
		System.out.println("Java development");
}
 }
	 class shiva2 implements A2  {
			public void add() {
				System.out.println("Hi");
			}
			public void sub() {
				System.out.println("Well come");
			}
			public void mul() {
				System.out.println("Java");
			}
	 }
	 public class case2{
		 

public static void main(String[] args) {

	shiva1 b1=new shiva1();
	shiva2 b2=new shiva2();
	
	b1.add();
	b1.sub();
	b1.mul();
	b2.add();
	b2.sub();
	b2.mul();
}
}
