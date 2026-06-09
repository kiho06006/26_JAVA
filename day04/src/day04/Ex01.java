package day04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int num = scan.nextInt();
		if(num < 18) {
			//참일 때 실행문
			System.out.println("청소년 관람 불가");
		} else {
			System.out.println("관람 가능");
		}

	}

}
