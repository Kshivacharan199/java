package shiva_day6;

public class thiskeyword {
	int a=20;
	int b=10;
	void add() {
	System.out.println(" addition is "+a+" and "+b+" is :"+(a+b));
}
void sub() {
	System.out.println("Addition is:");
	System.out.println("a: "+this.a);
	System.out.println("b: "+this.b);
this.add();
}
public static void main(String[] args) {                  //topic thiskeyword concept
	thiskeyword k=new thiskeyword();                      //1.using this
	k.sub();
	
		// TODO Auto-generated method stub

	}

}
