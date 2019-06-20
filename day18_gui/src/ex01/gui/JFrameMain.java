package ex01.gui;


import java.awt.TextArea;
import javax.swing.JFrame;


public class JFrameMain extends JFrame {

	
	  TextArea ta;
	  
	  public JFrameMain(String title) {
		setTitle(title);
		setBounds(350, 200, 400, 250);
		setVisible(true);
		ta = new TextArea("hi", 5 , 30 , TextArea.SCROLLBARS_BOTH);
				this.add(ta);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
	  public static void main(String[] args) {
		new JFrame("гоюл");
	}
}
