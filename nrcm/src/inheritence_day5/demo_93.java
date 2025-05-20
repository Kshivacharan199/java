package inheritence_day5;

public class demo_93 {
	void show() {
		System.out.println("good morning");
	}
	void show(int a,int b) {
		System.out.println("addition:"+ a+b);
	}
void show(double d,double d1){
		System.out.println("subtraction:"+ (d-d1));
	
	
}                                             //compile polymorpirsam  
void show(String s,String s1) {
	System.out.println("name:"+ s+s1);
}
	public static void main(String[] args) {
		demo_93 D1=new demo_93();
		D1.show();
		D1.show(2,3);
		D1.show(4d,5d);
		D1.show("hi ","shiva");

	}

}
