import java.util.Scanner;

public class switchpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		String monthword;
		System.out.println("해당 월의 영어이름가르쳐주는 프로그램");
		Scanner input = new Scanner(System.in);
		System.out.println("알고 싶은 월을 입력하십시오");
		month = input.nextInt();
		switch (month){
			case 1 :
				monthword = "january";
				System.out.println("해당 월의 영어이름은" + monthword + "입니다");

				break;
			case 2 : 
				monthword = "Febuary";
				System.out.println("해당 월의 영어이름은" + monthword + "입니다");

				break;
				
		}
		
	}

}
