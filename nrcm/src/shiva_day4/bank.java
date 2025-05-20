package shiva_day4;

 class fixedAmount {
	 public int fixedamount = 10000;
 }
 abstract class withdrawal 
 {
	 abstract void withdrawal(int amount);
 }
 public class bank extends withdrawal {
	 fixedAmount f1 = new fixedAmount();
	 void withdrawal (int amount) {
		 f1.fixedamount -= amount;
		 System.out.println("withdrawal amount:"+amount);
		 System.out.println("the amout ofter withdrawal :"+f1.fixedamount);
		 
	 }
	 
	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		bank b1=new bank();
		b1.withdrawal(amount);

	}

}
