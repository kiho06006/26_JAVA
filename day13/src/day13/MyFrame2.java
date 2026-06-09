package day13;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame2 extends JFrame{
	
	
	//생성자
	public MyFrame2() {
		this.setTitle("나만의 프레임 생성");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contain = getContentPane();
		contain.setBackground(Color.orange);
		contain.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		JButton btn3 = new JButton("무시");
		
		
		contain.add(btn1);	//컨포넌트 부착
		contain.add(btn2);
		contain.add(btn3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		MyFrame2 mf2 = new MyFrame2();
//		mf2.setSize(300,3000);
//		mf2.setTitle("300x300 사이즈의 프레임");
//		mf2.setVisible(true);
		
		//2. 콤퍼넌드 생선 - JBUTTON 객체 생성
//		JButton jbtn1 = new JButton("확인");
//		
//		JButton jbtn2 = new JButton();
//		jbtn2.setText("취소");
//		
//		//3. 컨테이너에 컴포넌트 2개 버튼 부착
////		jf.add(jbtn1);
////		jf.add(jbtn2);
//		
//		//3.1 판매 컨테이너 제출
//		JPanel jp = new JPanel();
//		jp.add(jbtn1);
//		jp.add(jbtn2);
//		
//		//3.2 프레임 컨테이너에 판넬 부착하기
//		mf2.add(jp);
//		
//		mf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		mf2.pack();
		
		
	}

}
