package day11;

//class SmartPhone {
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "스마트폰입니다.";
//	}
//}
public class SmartPhone extends Cakc implements PhoneInterface {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		sp.sendCall();
		sp.receiveCall();
		System.out.println("3 + 5 = "+sp.calculate(3, 5));
		System.out.println(SmartPhone.toString());

	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 벨~~~~");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 전화가 왔다.");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "스마트폰입니다.";
	}

}
