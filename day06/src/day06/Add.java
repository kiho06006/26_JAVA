package day06;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2개의 정수를 입력 받아서 더한 결과를 출력하시오. 
		double num1, num2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요 : ");
		num1 = s.nextDouble();
		System.out.println("실수를 입력하세요 : ");
		num2 = s.nextDouble();
		
		double sum = num1*num2;
		
		System.out.println(sum+" 입니다");

	}

}
