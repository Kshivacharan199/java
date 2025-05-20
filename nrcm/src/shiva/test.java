package shiva;

public class test {
	static int p=10,q=20;
	int a=10,b=20;
	void and() {
		System.out.println((a<b)&&(b<a));
	}
	void or() {
		System.out.println((p<q)||(q<p));
	}
	void not() {
		int x=10,y=20;
		System.out.println(!(x>y));
	}
	public static void main(String[] args) {
		test a1=new test();
		a1.and();
		a1.or();
		a1.not();
	}
}
 
