import java.util.Scanner;

public class midtermclass1 {
	Scanner input = new Scanner(System.in);
	double value;
	void op1(String s1, String s2){
		
		
		System.out.println(s1 + s2);
	return;
	}
	void op2(double a, double b, int c){
		
	    
		switch (c){
			case 1 : 
				value = a + b;
				System.out.println("value is" + value);
				break;
			
			case 2 : 
				value = a - b;
				System.out.println("value is" + value);
				break;
			case 3 : 
				value = a/b;
				System.out.println("value is" + value);
				break;
			case 4 : 
				value = a%b;
				System.out.println("value is" + value);
				break;
			case 5 : 
				value = a*b;
				System.out.println("value is" + value);
				break;
				
				
		}
	return;
	}
	void op3(){
		System.out.println("System End");
	}

}
