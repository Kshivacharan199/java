package project;
interface Hostel{
	void breakfast();
}
interface Hostel1{
	void lunch();
}
interface Hostel2{
	void snacks();
}
interface Hostel3 extends Hostel,Hostel1,Hostel2{
	void dinner();
}
class Hostel_Timings implements Hostel3{
	public void timings() {
		System.out.println("----Hostel Timings----");
	}
	public void breakfast() {
		System.out.println("Breakfast from 8:00 to 9:30");
	}
	public void lunch() {
		System.out.println("Lunch from 8:00 to 9:30");
	}
	public void snacks() {
		System.out.println("Snacks from 4:00 to 5:00");
	}
	public void dinner() {
		System.out.println("Dinner from 8:00 to 9:00");
	}
}
public class case10 {
	public static void main(String[] args) {
		Hostel_Timings h1=new Hostel_Timings();
		h1.timings();
		h1.breakfast();
		h1.lunch();
		h1.snacks();
		h1.dinner();
	}

}
