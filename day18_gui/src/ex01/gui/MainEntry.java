package ex01.gui;

import java.awt.*;
import java.awt.event.*;


public class MainEntry {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setTitle("First Frame");
		f.setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		//f.pack(); 크기만큼 보여줌
		f.setBounds(500, 350, 500, 300); //창 실행 위치 , 창크기 한번에 설정
		//f.setLocation(100, 500);// 창이 실행되는 위치
		//f.setSize(500, 400); //창의 크기
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
	}
}
