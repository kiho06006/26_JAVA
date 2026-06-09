package day11;

public class SamsungPhone implements PhoneInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone sp = new SamsungPhone();
		sp.sendCall();
		sp.receiveCall();
		
		PhoneInterface pi = new PhoneInterface();

	}

	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리리리링");
		
	}

	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
		
	}

}
