package project;
interface B1{
	void add(); 
}
interface B2{
	void sub(); 
}
class shiva{
	public void add1() {
		System.out.println("hi");
	}
}
class shiva1 extends shiva implements B1,B2 {
	public void add2() {
		System.out.println("Welcome");
		
	}

public void sub1() {
	System.out.println("to");
}
public void mod() {
	System.out.println("java");
}
}
class shiva3 extends shiva1{
	public void mul() {
		System.out.println("javadevelopment");
		
	}
}



public class case5 {

	public static void main(String[] args) {
		shiva3 s=new shiva3();
		s.mul();
		

	}

}
