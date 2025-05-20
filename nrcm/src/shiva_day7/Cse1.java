package shiva_day7;
import java.util.*;
public class Cse1 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the a,b values:");
			try {
				int a= sc.nextInt();
				int b= sc.nextInt();
				int c=a/b;
				System.out.println("c");
			}
			catch (ArithmeticException|InputMismatchException e) {
				System.out.println(e.getMessage());
			
	}
		}
}

