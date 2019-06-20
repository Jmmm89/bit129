package ex01.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.List;
import java.awt.Panel;

import javax.swing.JFrame;

public class BorderLayoutMain extends JFrame{

	public BorderLayoutMain() {
		
		Button btn1 = new Button("EAST");
		Button btn2 = new Button("WEST");
		Button btn3 = new Button("CENTER");
		Button btn4 = new Button("SOUTH");
		Button btn5 = new Button("NORTH");
		
		Panel p = new Panel();
		List list = new List(5, true);
		list.add("¿Á¿µÇÐ");
		list.add("±è½Â¼ö");
		list.add("³²¹ÎÁö");
		list.add("ÀÌ¼Ò¿µ");
		list.add("±è±¤¹ü");
		
		p.add(list);
		add(p);
		
		
		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(p, BorderLayout.CENTER);
		add(btn4, BorderLayout.SOUTH);
		add(btn5, BorderLayout.NORTH);
		
		setTitle("BorderLayout test");
		setBounds(350, 200, 400, 200);
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new BorderLayoutMain();
	}
	
}
