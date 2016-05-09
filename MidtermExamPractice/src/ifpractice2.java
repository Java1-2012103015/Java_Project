import java.util.Scanner;

public class ifpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("대소를 비교하고자 하는 두 수를 입력해 주세요");
		a = input.nextInt();
		b = input.nextInt();
		if(a>b){
			System.out.println("큰 값은 " + a);
			
		}
		else {
			System.out.println("큰 값은" + b);
		}

	}

}
