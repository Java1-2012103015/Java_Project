import java.util.Scanner;

public class dowhilepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1-12에 해당하는 숫자를 입력하시오");
			i = input.nextInt();
			
		}while(i<1 || i>12);

	}

}
