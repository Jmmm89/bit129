package ex03.swing;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class CheckRadioEx extends JFrame {

		JCheckBox win, linux, solaris;
		JRadioButton man, woman;
		
		public CheckRadioEx(String str) {
			
			super(str);
			getContentPane().setLayout(new FlowLayout());
			win = new JCheckBox("윈도우", true);
			linux = new JCheckBox("리눅스", true);
			solaris = new JCheckBox("솔라리스", true);
			
			ButtonGroup group = new ButtonGroup();
			man = new JRadioButton("남자", true);
			woman = new JRadioButton("여자", false);
			group.add(man);
			group.add(woman);
			
			getContentPane().add(win);
			getContentPane().add(linux);
			getContentPane().add(solaris);
			getContentPane().add(man);
			getContentPane().add(woman);
			
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setBounds(300, 150, 250, 200);
			this.setVisible(true);
			
		}//constr end
		public static void main(String[] args) {
			new CheckRadioEx("checkbox radiobutton test");
			
		}
		
}
