package shiva_day7;

public class Cse5 extends Thread {

	public static void main(String[] args)  {
		Cse5 c1=new Cse5();
		Thread t1=new Thread(c1);		
		t1.start();
		System.out.println("hi");
		try {
			c1.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
	}  

}
