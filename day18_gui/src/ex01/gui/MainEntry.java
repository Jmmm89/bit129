package ex01.gui;

import java.awt.*;
import java.awt.event.*;


public class MainEntry {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setTitle("First Frame");
		f.setBackground(Color.DARK_GRAY);
		f.setVisible(true);
		//f.pack(); ũ�⸸ŭ ������
		f.setBounds(500, 350, 500, 300); //â ���� ��ġ , âũ�� �ѹ��� ����
		//f.setLocation(100, 500);// â�� ����Ǵ� ��ġ
		//f.setSize(500, 400); //â�� ũ��
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
	}
}
