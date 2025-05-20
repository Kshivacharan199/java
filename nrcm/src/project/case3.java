package project;
interface icecream{
	void flavours();
}
class chocolate {
	public void black() {
		System.out.println("I like black chocolate ice cream");
	}
}
class vanilla extends chocolate implements icecream {
	public void white() {
		System.out.println("I like white vanilla ice cream");
	}
	public void red() {
		System.out.println("I like strawberry ice cream");
	}
	public void cone() {
		System.out.println("I like cone kulfi ice cream");
	}
	}
class buleberry extends vanilla{
	public  void mango() {
		System.out.println("I like mango ice  cream");	
	}
	public  void blackberry() {
		System.out.println("I like blackberry ice  cream");
	
	}
}
public class case3 {
	public static void main(String[] args) {
		buleberry b1=new buleberry();
		b1.white();
		b1.red();
		b1.cone();
		b1.mango();
		b1.blackberry();
	}

}
