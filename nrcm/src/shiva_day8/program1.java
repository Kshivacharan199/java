package shiva_day8;

public class program1 implements Runnable {
	public void run() {
		System.out.println("hi");
	}
//
//	public static void main(String[] args) { 
//		program1 p1=new program1();
//		Thread p2=new Thread(p1);
//		System.out.println("hello");
//		p2.start();

	public static void main(String[] args) { 
//		program1 p1=new program1();
//		program1 p2=new program1();
//		Thread t1=new Thread(p1);
//		Thread t2=new Thread(p1);         //it is a thread class orogram
//		System.out.println("hello");
//		t1.start();
//		t2.start();
		
		
		program1 p1=new program1();
		program1 p2=new program1();
		
		System.out.println("hello");        //it is a normal p-rogram
		p1.run();
		p2.run();

	}

}
