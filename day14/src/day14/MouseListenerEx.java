package day14;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
    
    JLabel lb; // 컴포넌트 선언
    
    // 생성자
    public MouseListenerEx() {
        setTitle("Mouse 이벤트 예제"); // 타이틀 설정
        
        Container con = getContentPane();
        // 1. 자유로운 배치를 위해 레이아웃을 null로 설정
        con.setLayout(null); 
        
        // 2. 마우스 리스너를 컨텐트팬에 등록
        con.addMouseListener(new MyMouseListener());
        
        lb = new JLabel("Hello");
        lb.setSize(50, 20);
        lb.setLocation(30, 30); // 초기 위치 설정
        con.add(lb);
        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // setVisible은 보통 가장 마지막에 호출하는 것이 좋습니다.
    }
    
    public static void main(String[] args) {
        new MouseListenerEx();
    }
    
    // 내부 클래스(Inner Class)로 마우스 리스너 객체 구현
    class MyMouseListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            // 마우스 버튼이 '눌렸을 때' 즉시 위치를 이동합니다.
            int x = e.getX();
            int y = e.getY();
            lb.setLocation(x, y);
        }
    }
}









