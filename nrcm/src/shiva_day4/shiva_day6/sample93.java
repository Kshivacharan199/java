package shiva_day6;
class cdc1{
	void show() {
		System.out.println("java");
	}
}

public class sample93 {  //anynomous method 
	cdc1 c2=new cdc1() {
		void show() {
			System.out.println("hello");
			super.show();
		
	}
};
	

	public static void main(String[] args) {
		sample93 s1=new sample93();
		s1.c2.show();
		// TODO Auto-generated method stub

	}
}


