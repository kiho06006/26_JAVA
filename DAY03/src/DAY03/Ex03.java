package DAY03;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오. : ");
		
		int num = sc.nextInt();
		int n = num % 2; //짝수 홀수 판단 식
		
		String result = (n == 0) ? "짝수" : "홀수";
		
		System.out.println(result);

	}

}
