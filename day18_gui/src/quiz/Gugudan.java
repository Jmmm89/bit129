package quiz;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
 
import javax.swing.*;
 
public class Gugudan extends JFrame implements ActionListener {
    //필드
    JList<String> list;
    Vector<String> vector;
    JPanel p;
    JButton btn;
    
    public Gugudan(String title) {
        super(title); //타이틀
        //필드 객체생성
        p = new JPanel();
        p.setLayout(new BorderLayout());
        list = new JList<String>();
        vector = new Vector<String>();
        
        //버튼생성
        Panel btnP = new Panel();
        for(int i = 2; i <= 9; i++) {
            btn = new JButton(i + "단");
            btn.addActionListener(this);
            btnP.add(btn);
        }
        
        //배치하기
        p.add("Center", new JScrollPane(list));
        add("South", btnP);
        
        //프레임 설정
        getContentPane().add(p);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    //이벤트
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand(); // 버튼이름 얻기
        int dan = Integer.parseInt((String) str.subSequence(0, 1)); // 맨앞 한글자만 얻기 (ex 2단 -> 2)
        vector.add(dan + "단 눌렀습니다.");
        //구구단 계산
        for(int i = 1; i <= 9; i++) {
            String result = dan + " * " + i + " = " + (dan*i);
            vector.add(result);
            list.setListData(vector);
        }
        
    }
    
    //실행
    public static void main(String[] args) {
        new Gugudan("구구단 프로그램");
    }
}