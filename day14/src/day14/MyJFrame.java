package day14;

import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame {
	
	public MyJFrame() {
		this.setTitle("나만의 프레임");
		Container con = getContentPane();
		setLayout(new FlowLayout());
		JButton btn = new JButton("소개");
		con.add(btn);
		JTextField jf;
		con.add(jf = new JTextField(20));
		JButton btn2 = new JButton("확인");
		con.add(btn2);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object obj = e.getSource();
				
				if(obj == btn) System.out.println("소개 버튼 클릭");
				
				//if(obj == btn) System.out.println(jf.getText());
			}
			
		});
		
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//Object obj = e.getSource();
				
				//if(obj == btn) System.out.println("소개 버튼 클릭");
				
				System.out.println(jf.getText());
				jf.setText("");
			}
			
		});
		
		
		setSize(300, 200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}




public static void main(String[] args) {
	new MyJFrame();
}
}
