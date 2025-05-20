package shiva_day4;

public class test4 {
	int x;
	int y;
	public test4(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}

			public test4(test4 t) {
				this.x=t.x;
				this.y=t.y;
				System.out.println(x-y);
			}
		
	
	

	public static void main(String[] args) {
		test4 t=new test4(4,5);
		test4 t1=new test4(t);
		
		// TODO Auto-generated method stub

	}
	}


