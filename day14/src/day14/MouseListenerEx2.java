package day14;

import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class MouseListenerEx2 extends JFrame {
    
    JLabel lb; // 좌표를 표시할 컴포넌트 선언
    
    // 생성자
    public MouseListenerEx2() {
        setTitle("Mouse 이벤트 예제"); 
        
        Container con = getContentPane();
        // 1. 자유로운 배치를 위해 레이아웃을 null로 설정
        con.setLayout(null); 
        
        // 2. 마우스의 움직임을 감지할 리스너 등록
        MyMouseListener listener = new MyMouseListener();
        con.addMouseMotionListener(listener); 
        
        // 초기 텍스트를 좌표 모양으로 설정하고, 글자가 잘리지 않게 가로 크기를 100으로 늘렸습니다.
        lb = new JLabel("X: 30, Y: 30");
        lb.setSize(100, 20); 
        lb.setLocation(30, 30); // 초기 위치 설정
        con.add(lb);
        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
    }
    
    public static void main(String[] args) {
        new MouseListenerEx2();
    }
    
    // MouseAdapter를 상속받아 마우스 이동 이벤트를 처리합니다.
    class MyMouseListener extends MouseAdapter {

        // 마우스를 그냥 움직일 때
        @Override
        public void mouseMoved(MouseEvent e) {
            updateCoordinates(e);
        }

        // 마우스를 누른 채로 드래그할 때
        @Override
        public void mouseDragged(MouseEvent e) {
            updateCoordinates(e);
        }
        
        // [핵심] 위치 이동과 동시에 GUI 텍스트를 변경하는 메서드
        private void updateCoordinates(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            
            // 1. 라벨의 텍스트를 현재 마우스 좌표 문자열로 변경 (GUI 화면에 반영)
            lb.setText("X: " + x + ", Y: " + y);
            
            // 2. 라벨의 위치를 마우스 포인터 위치로 이동
            Point p = new Point(x, y);
            lb.setLocation(p); 
        }
    }
}







