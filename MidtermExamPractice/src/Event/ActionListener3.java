package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	
	public MyFrame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� ��������");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == button){
			label.setText("��ħ�� ��ư�� ���Ƚ��ϴ�");
		}
	}
	
}

public class ActionListener3 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		

	}

}
