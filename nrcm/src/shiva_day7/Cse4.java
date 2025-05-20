package shiva_day7;

public class Cse4 { 
	
	static void add(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("madam miku maths radha");
		}
		
	int c=a/b;
	 
		System.out.println(c);
}

		public static void main(String[] args) {
			try {
				add(10,0);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			
			
		// TODO Auto-generated method stub
			
		
//	} finally {
//		System.out.println("covered all keywords");
	}
		}
}

