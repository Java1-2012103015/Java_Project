import java.util.Scanner;

public class midtermclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		do{
		Scanner input = new Scanner(System.in);
		midtermclass1 class2 = new midtermclass1();
		
		System.out.println("Choose oporater");
		System.out.println("op1 = ���ڿ� ��ġ��[1]");
		System.out.println("op2 = ����ϱ�[2]");
		System.out.println("op3 = ������[3]");
		i = input.nextInt();
		
		switch (i) {
		 case 1 :
			 System.out.println("���ڿ� 2���� �Է��Ͻÿ� ");
			 String s1 = input.next();
			 String s2 = input.next();
			 class2.op1(s1, s2);
			 break;
			 
		 case 2 :
			 System.out.println("�� ���� �����ڸ� �Է��Ͻÿ�(����2�� �� ������ ������)");
		     System.out.println("�����ڴ� �ش� ��ȣ �Է�(+,-,/,%,*)");
			 double a = input.nextDouble();
			 double b = input.nextDouble();
		     int c = input.nextInt();
			 class2.op2(a, b, c);
			 break;
			 
			    
		 case 3 : 
			 class2.op3();
			 break;}}}}
		while (i == 3);}}}
		 	
		
		


