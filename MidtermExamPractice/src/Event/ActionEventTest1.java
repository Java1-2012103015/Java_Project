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
		button1.setText("마침내 버튼이 눌러졌습니다");}
		else if(e.getSource() == button2){
	    button2.setText("눌렀구나!");}
	}
}

class MyFrame extends JFrame{
	private JButton button1;
	private JButton button2;	
	private JLabel label;
	
public MyFrame(){
	this.setSize(300,200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("이벤트예제");
	JPanel panel = new JPanel();
	button1 = new JButton("버튼을 누루시오");
	button2 = new JButton("버튼눌러!");
	label = new JLabel("아직 버튼이 눌러지지 않았습니다");
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