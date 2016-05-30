package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JButton button1 = (JButton)e.getSource();
		JButton button2 = (JButton) e.getSource();
		if (e.getSource() == button1){
		button1.setText("��ħ�� ��ư�� ���������ϴ�");}
		else if(e.getSource() == button2){
	    button2.setText("��������!");}
	}
}

class MyFrame extends JFrame{
	private JButton button1;
	private JButton button2;	
	private JLabel label;
	
public MyFrame(){
	this.setSize(300,200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("�̺�Ʈ����");
	JPanel panel = new JPanel();
	button1 = new JButton("��ư�� ����ÿ�");
	button2 = new JButton("��ư����!");
	label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
	button1.addActionListener(new MyListener());
	button2.addActionListener(new MyListener());
	panel.add(button1);
	panel.add(button2);
	panel.add(label);
	this.add(panel);
	this.setVisible(true);
}
}

public class ActionEventTest1 {
	public static void main(String[] args){
		MyFrame t = new MyFrame();
	}
}