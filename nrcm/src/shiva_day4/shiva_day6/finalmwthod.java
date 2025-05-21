package shiva_day6;
class case1{
	final void show()
	{
		System.out.println("hello");
	}
}


public class finalmwthod  extends case1{
	 void show() {
		int a=96;
		System.out.println(a);
		a=34;                                              //topic keywords                                                   //faina 1)posible,2)not posible
		System.out.println(a);
	}

	public static void main(String[] args) {
		finalmwthod  f=new finalmwthod ();
		f.show();

	}

}
