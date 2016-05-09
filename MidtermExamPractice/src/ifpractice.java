import java.util.Scanner;

public class ifpractice {

	public static void main(String[] args) {
		int a;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("짝수 홀수 판별 프로그램");
		System.out.println("점검하고 싶은 값을 입력하시오");
		a=input.nextInt();
		if(a%2==0){
			System.out.println(a + "is 2x");}
			else{
				System.out.println(a + "is 2x+1");
		}

	}

}
