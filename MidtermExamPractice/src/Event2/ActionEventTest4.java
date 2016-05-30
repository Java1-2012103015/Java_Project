package Event2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
public MyFrame(){
	this.setTitle("이벤트 예제4");
	this.setSize(300, 200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	button = new JButton("버튼 누르세요");
	label = new JLabel("아직 눌려지지 않았습니다");
	button.addActionListener();
}
}

public class ActionEventTest4 {

}
