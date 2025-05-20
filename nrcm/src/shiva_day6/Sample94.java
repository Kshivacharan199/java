package shiva_day6;
//static inner class method
class Sample94 {
	static void show() {
		System.out.println("hi");
	}
	static class Test24{
		static void print() {
			System.out.println("java");
			show();
		}
	}

	public static void main(String[] args) {
		Sample94.Test24.print();
		// TODO Auto-generated method stub

	}

}
