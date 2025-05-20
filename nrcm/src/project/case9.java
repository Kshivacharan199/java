package project;
interface  AppointmentBooking{
	void book();
}
interface  MedicalRecord{
	void records();
}
interface  Prescription extends  MedicalRecord , AppointmentBooking{
	void tablets();
}
class Patient{
	public void problem() {
		
	}
}
public class case9 extends Patient implements Prescription {
	public void book() {
		System.out.println("patient book the appointment ");
	}
	public void records() {
		System.out.println("patient have is records ");
	}
	public void tablets() {
		System.out.println("patient take the tablets ");
	}
	public void problem() {
		System.out.println("patient's problem");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		case9 t1=new case9();
		
		t1.book();
        t1.problem();
        t1.records();
        t1.tablets();
	}

}

