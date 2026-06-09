package day11;
import java.util.Random;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		//int n[] = new int[6];
		
		int n=0;
		for(int i=1; i<=6; i++) {
			n = random.nextInt(45)+1;
			System.out.println(n);
		}

	}

}
