//package quiz;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JFrame;
//
//
//
//
//public class Quiz extends JFrame implements ActionListener{
//
//	Label gugulb;
//	TextArea box;
//	Button [] gugubtn = new Button[9];
//	int [] gugunum = { 1,2,3,4,5,6,7,8,9 };
//	
//	
//	public Quiz(String str) {
//		super(str);
//		setTitle("������");
//		
//		setBounds(350, 250, 500, 300);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new FlowLayout());
//		
//	
//	
//		
//		
//		for(int i = 0; i < gugunum.length ; i++){
//			gugubtn[i]=new Button((i+1)+"dan");			
//			gugubtn[i].addActionListener(this);
//			add(gugubtn[i],"South");
//			
//		}
//		setVisible(true);
//
//		
//		
//
//	
//		box = new TextArea("������ " , 200, 100, TextArea.SCROLLBARS_VERTICAL_ONLY);
//		
//		this.add(box);
//	}
//	public void gugu(int i) {
//		for(int j=1; j<=9;i++) {
//			System.out.println(i+"*"+j+"="+i*j);
//		}
//	}
//	
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//	
//		Object obj = e.getSource();
//
//		if((Button)obj==gugunum[0]){
//		
//		}
////			lb.setText("���� ��ư �������ϴ�.");
////		}else{
////			lb.setText("������ ��ư �������ϴ�.");
////		}
////	}
//		}
//	
//	public static void main(String[] args) {
//		
//		new Quiz("������ ");
//	}
//
//
//
//}
