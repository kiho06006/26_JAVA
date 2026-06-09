package my.app;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> alist = new ArrayList<>();
		//이름을 4번 입력 해서 컬렉션에 저장하기
		for(int i =0; i<4; i++) {
			System.out.println("이름을 입력하세요: ");
			alist.add(scan.nextLine());
		}
		
		//저장된 모든 이름을 모두 출력하기
		for(int i=0; i<alist.size(); i++) {
			// ArrayList의i번째문자열얻어오기
			String name = alist.get(i); 
			System.out.print(name + " ");
		}

	}

}
