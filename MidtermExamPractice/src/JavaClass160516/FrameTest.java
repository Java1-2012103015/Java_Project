package JavaClass160516;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Java Pizza");
		JPanel panela = new JPanel();
		JPanel panelb = new JPanel();
		
		
		//JLabel label1 = new JLabel("ȭ���µ�");
		//JLabel label2 = new JLabel("�����µ�");
		JLabel mainname = new JLabel("���ڸ� �����ϼ���");
		JLabel label3 = new JLabel("���� : ");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		//JButton button = new JButton("��ȯ");
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("�Ұ������");
		JButton button3 = new JButton("������������");
		f.setSize(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		//panel1.add(label1);
		//panel1.add(field1);
		//panel1.add(label2);
		//panel1.add(field2);
		//panel1.add(button);
		panela.add(mainname);
		panela.add(button1);
		panela.add(button2);
		panela.add(button3);
		panelb.add(label3);
		panelb.add(field1);
		
		f.add(panela);
		f.add(panelb);
		
		

	}

}
