package shiva;

public class l2 {
	int a=23;
	void B()
	{
		if(a<0) {
			System.out.println("the  number does not lie between 1 to 10");
		}
		else {
			if(a>=1 && a<=10)
			{
				System.out.println("the number lies between 1 to 10");
			}
			else
			{
				System.out.println("not this number does not exists in 1 to 10");
			}
		}
	}
	public  static void main(String[] args)
	{
	l2 c=new l2();
	c.B();
}
	
}
