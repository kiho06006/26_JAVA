package day04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//1부터 10까지의 합을 계산하는 for반복문 완성
//		int sum = 0;
//		for(int i =1; i<=10; i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		}
		
		// 5개 정수 입력 받아서 양수의 합을 구하시오.
		
		//무한 반복해서 정수를 입력한 후 음수가 입력되면 무한 반복을 종료하고 누적의 합을 출력하기.
		
		Scanner scan = new Scanner(System.in);
		
		int sum =0; 
		
		System.out.println("정수를 입력하세요");
		for(int i=1; i<=5; i++) {
			int num = scan.nextInt();
			// 만약에 정수가 음수라면, 무시, 양수이면 합 추가
			if(num <0)
				continue;
			else {
				sum = sum + num;
				
			}
			
		}
		System.out.println("양수의 합은 "+ sum);

	}

}
