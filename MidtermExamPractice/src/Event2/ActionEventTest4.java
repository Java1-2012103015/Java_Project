package Event2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
public MyFrame(){
	this.setTitle("�̺�Ʈ ����4");
	this.setSize(300, 200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	button = new JButton("��ư ��������");
	label = new JLabel("���� �������� �ʾҽ��ϴ�");
	button.addActionListener();
}
}

public class ActionEventTest4 {

}
