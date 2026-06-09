package day06;

import java.util.Scanner;

public class Methood3 {
	
	// 2개의 정수와 1개의 문자열을  입력 받아서 사칙연산을 수행하는 계산기 메소드를 add(), sub(), mul(),div()
	// 정의하시오.
	// 문자열이 + 이면 add()호출 , -이면 sub()호출, *이면 mul() 호출 , /dlv() 이면()호출
	public static int add(int a, int b) {
		return a +b;
	}
	
	public static int sub(int a, int b) {
		return a -b;
	}
	
	public static int mul(int a, int b) {
		return a *b;
	}
	
	public static int div(int a, int b) {
		if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
		return a /b;
	}
	

	public static int calculate(int a, int b, String op) {

        if (op.equals("+")) {
            return add(a, b);
        } else if (op.equals("-")) {
            return sub(a, b);
        } else if (op.equals("*")) {
            return mul(a, b);
        } else if (op.equals("/")) {
            return div(a, b);
        } else {
            System.out.println("잘못된 연산자입니다.");
            return 0;
        }
    }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("첫 번째 정수 : ");
	        int a = sc.nextInt();

	        System.out.print("연산자 : ");
	        String op = sc.next();

	        System.out.print("두 번째 정수 : ");
	        int b = sc.nextInt();

	        int result = calculate(a, b, op);

	        System.out.println("결과 : " + result);
    }

}
