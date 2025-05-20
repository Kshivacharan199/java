package project;
interface Borrowable{
	void borrowBook();
	
}
interface Returnable{
	void returnBook();
}
interface Reversable {
	void reverseBook();
}
class Student implements Borrowable{
	public void borrowBook() {
		System.out.println("student Barrowed book");
	}
}
class Faculty implements Reversable{
	public void reverseBook() {
		System.out.println("factuly reversed book");
	}
}
class Librerian implements Returnable{
	public void returnBook() {
		System.out.println("librerian collect's books");
	}
}
public class case7 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.borrowBook();
		Faculty f1 =new Faculty();
		f1.reverseBook();
		Librerian l1=new Librerian();
		l1.returnBook();
		
		

	}

}

