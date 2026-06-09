package day04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("필기 점수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("토익 점수를 입력하세요 : ");
		int to = scan.nextInt();
		if(num >= 80 && to >= 850) {
			//참일 때 실행문
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}


}
