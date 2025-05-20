package shiva_day4;

public class test7 { 
	int scc;
	int inter;
	int btech;
	public test7() {
		System.out.println("welcome to my profile");
	}
	public test7(int scc) {
		this.scc=scc;
		System.out.println(scc);
	}
	public test7(int scc,int inter) {
		this.scc=scc;
		this.inter=inter;
		System.out.println(scc+inter);
	}
	public test7(int scc,int inter,int btech) {
		this.scc=scc;
		this.inter=inter;
		this.btech=btech;
		System.out.println(scc+inter+btech);
	}
	

	public static void main(String[] args) {
		test7 t=new test7();
		test7 t1=new test7(93);
		test7 t2=new test7(93,721);
		test7 t3=new test7(93,721,74);
		

	}

}
