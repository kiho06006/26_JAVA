package day04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int balance = 10000;
		System.out.println("나이를 입력하시오 : ");
		int age = scanner.nextInt();
		
		if(age >= 7 && age <= 12) {
			balance -= 450;
		}else if(age >=13 && age <= 18) {
			balance -= 720;
		}else if(age >= 19) {
			balance -= 1200;
		}
		
		System.out.println("잔액"+ balance +"원 입니다.");
		
		scanner.close();

	}

}
