package ex03.swing;

import javax.swing.*;
import java.awt.*;


public class JTableEx extends JFrame {
	
	JTable table;
	String[] fieldName = { "학번", "국어", "전산", "수학" };
	String[][] data = {{"001","60","70","80"},
						{"002","66","70","80"},
						{"003","90","77","80"},
						{"004","80","70","88"},
						{"005","40","70","59"}
	};
	
	public JTableEx(String str) {
		super(str);
		table = new JTable(data, fieldName);
		JScrollPane sp = new JScrollPane(table);
		getContentPane().add(sp, "Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTableEx("테이블~");
	}
}
