import java.util.Scanner;

public class midtermclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		do{
		Scanner input = new Scanner(System.in);
		midtermclass1 class2 = new midtermclass1();
		
		System.out.println("Choose oporater");
		System.out.println("op1 = 문자열 합치기[1]");
		System.out.println("op2 = 계산하기[2]");
		System.out.println("op3 = 끝내기[3]");
		i = input.nextInt();
		
		switch (i) {
		 case 1 :
			 System.out.println("문자열 2개를 입력하시오 ");
			 String s1 = input.next();
			 String s2 = input.next();
			 class2.op1(s1, s2);
			 break;
			 
		 case 2 :
			 System.out.println("두 수와 연산자를 입력하시오(숫자2개 후 연산자 순으로)");
		     System.out.println("연산자는 해당 번호 입력(+,-,/,%,*)");
			 double a = input.nextDouble();
			 double b = input.nextDouble();
		     int c = input.nextInt();
			 class2.op2(a, b, c);
			 break;
			 
			    
		 case 3 : 
			 class2.op3();
			 break;}}}}
		while (i == 3);}}}
		 	
		
		


