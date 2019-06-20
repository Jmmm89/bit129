package quiz;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
 
import javax.swing.*;
 
public class Gugudan extends JFrame implements ActionListener {
    //�ʵ�
    JList<String> list;
    Vector<String> vector;
    JPanel p;
    JButton btn;
    
    public Gugudan(String title) {
        super(title); //Ÿ��Ʋ
        //�ʵ� ��ü����
        p = new JPanel();
        p.setLayout(new BorderLayout());
        list = new JList<String>();
        vector = new Vector<String>();
        
        //��ư����
        Panel btnP = new Panel();
        for(int i = 2; i <= 9; i++) {
            btn = new JButton(i + "��");
            btn.addActionListener(this);
            btnP.add(btn);
        }
        
        //��ġ�ϱ�
        p.add("Center", new JScrollPane(list));
        add("South", btnP);
        
        //������ ����
        getContentPane().add(p);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    //�̺�Ʈ
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand(); // ��ư�̸� ���
        int dan = Integer.parseInt((String) str.subSequence(0, 1)); // �Ǿ� �ѱ��ڸ� ��� (ex 2�� -> 2)
        vector.add(dan + "�� �������ϴ�.");
        //������ ���
        for(int i = 1; i <= 9; i++) {
            String result = dan + " * " + i + " = " + (dan*i);
            vector.add(result);
            list.setListData(vector);
        }
        
    }
    
    //����
    public static void main(String[] args) {
        new Gugudan("������ ���α׷�");
    }
}