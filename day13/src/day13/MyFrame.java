package day13;
import javax.swing.*;

public class MyFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf =new JFrame();
		jf.setSize(300,3000);
		jf.setTitle("300x300 사이즈의 프레임");
		jf.setVisible(true);
		
		//2. 콤퍼넌드 생선 - JBUTTON 객체 생성
		JButton jbtn1 = new JButton("확인");
		
		JButton jbtn2 = new JButton();
		jbtn2.setText("취소");
		
		//3. 컨테이너에 컴포넌트 2개 버튼 부착
//		jf.add(jbtn1);
//		jf.add(jbtn2);
		
		//3.1 판매 컨테이너 제출
		JPanel jp = new JPanel();
		jp.add(jbtn1);
		jp.add(jbtn2);
		
		//3.2 프레임 컨테이너에 판넬 부착하기
		jf.add(jp);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.pack();
		
		
	}

}
