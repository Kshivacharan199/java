package shiva_day4;

public class demo11 {
	private String firstName;
	private String lastName;
	private String Email;
	private long Phonenumber;
	
	public void setFirstName(String fn) {
		firstName=fn; 
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmail(String e) {
		Email=e;
	}
	public void setPhonenumber(long ph) {
		Phonenumber=ph;
	} 
	public String getFirstName() {
		return firstName; 
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return Email;
	}
	public long getPhonenumber() {
		return Phonenumber;
	}
	public static void main(String[] args) {
		demo11 D1=new demo11();
		D1.setFirstName("shiva");
		D1.setLastName("charan");
		D1.setEmail("kethapallyshivacharan@gmail.com");
		D1.setPhonenumber(8374018691l);
		System.out.println(D1.getFirstName());
		System.out.println(D1.getLastName());
		System.out.println(D1.getEmail());
		System.out.println(D1.getPhonenumber());
	}
	}


