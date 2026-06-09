package DAY03;

import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//id / pw 초기화
		String id = "hong", pwd = "1234";
		
		System.out.println("아이디를 입력하세요 : ");
		String myid = scan.next();
		
		System.out.println("비밀번호를 입력하세요 : ");
		String mypw = scan.next();
		
		//아이디는 hong  
		if((myid.equals(id)) && (mypw.equals(pwd))) {
			//참일 때 실행문
			System.out.println("로그인 성공입니다.");
		} else {
			System.out.println("로그인 실패입니다.");
		}

	}

}
