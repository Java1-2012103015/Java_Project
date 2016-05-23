package report;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Calculator extends JFrame {
	public Calculator(){
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		
		
		JPanel panelDef = new JPanel();
		JLabel label = new JLabel(" ");
		panelDef.add(label);
		
		
		JPanel panel1 = new JPanel();		
			JButton num1 =  new JButton("1");
			JButton num2 =  new JButton("2");
			JButton num3 =  new JButton("3");
			JButton num4 =  new JButton("4");
			JButton num5 =  new JButton("5");
			JButton num6 =  new JButton("6");
			JButton num7 =  new JButton("7");
			JButton num8 =  new JButton("8");
			JButton num9 =  new JButton("9");
			JButton num0 =  new JButton("0");
			JButton equal = new JButton("=");
			panel1.add(num1);
			panel1.add(num2);
			panel1.add(num3);
			panel1.add(num4);
			panel1.add(num5);
			panel1.add(num6);
			panel1.add(num7);
			panel1.add(num8);
			panel1.add(num9);
			panel1.add(num0);
			panel1.add(equal);
		JPanel panel2 = new JPanel();
			JButton plus =  new JButton("+");
			JButton minus =  new JButton("-");
			JButton multiply =  new JButton("*");
			JButton division =  new JButton("/");
			panel1.add(plus);
			panel1.add(minus);
			panel1.add(multiply);
			panel1.add(division);
		
		add(panelDef);
		add(panel1);
		//add(panel2);
		setVisible(true);
		
		
	}
	

}
public class MyCalculator{
	public static void main(String[] args){
		Calculator f = new Calculator();
	}
}
