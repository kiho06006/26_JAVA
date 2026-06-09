package DAY03;
//import 
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int age; 	//변수 선언
		String name = new String();
		// 변수 초기화
		age = 20;
		name = "김수민";
		
		// Scanner객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		age = scan.nextInt();
		
		System.out.println("이름을 입력하세요 : ");
		name = scan.next();
		
		double height;
		System.out.println("키를 입력하세요 : ");
		height = scan.nextDouble();
		
		System.out.println("도시를 입력하세요 : ");
		String city = scan.next();
		
		System.out.println("독신 여부는 : ");
		boolean couple = scan.nextBoolean();
		
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("도시: " + city);
		System.out.println("독신 여부는" + couple + "입니다.");

	}

}
