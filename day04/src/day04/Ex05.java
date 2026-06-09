package day04;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 부터 10까지의 합을 계산하는 while 반복문 완성
		
		//for(초기식;조거식;증감식) {실행문}
		
//		int i = 1; //초기식
//		int sum = 0; 
//		while(i <= 100) {
//			sum = sum+ i;
//			i++;
//		}
//		System.out.println(sum);
		
		int i = 1;
		int sum =0;
		do {
			sum = sum + i;
			i++;
		}while(i<=100);
		
		System.out.println(sum);

	}

}
