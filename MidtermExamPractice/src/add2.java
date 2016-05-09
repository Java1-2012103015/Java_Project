import java.util.Scanner;

public class add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,sum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하시오");
		x = input.nextInt();
		System.out.println("두번째 수를 입력하시오");
		y = input.nextInt();
		
		sum = x + y;
				
		System.out.println("합은"+sum);

	}

}
