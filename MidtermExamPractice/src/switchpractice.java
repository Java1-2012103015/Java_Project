import java.util.Scanner;

public class switchpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		String monthword;
		System.out.println("�ش� ���� �����̸��������ִ� ���α׷�");
		Scanner input = new Scanner(System.in);
		System.out.println("�˰� ���� ���� �Է��Ͻʽÿ�");
		month = input.nextInt();
		switch (month){
			case 1 :
				monthword = "january";
				System.out.println("�ش� ���� �����̸���" + monthword + "�Դϴ�");

				break;
			case 2 : 
				monthword = "Febuary";
				System.out.println("�ش� ���� �����̸���" + monthword + "�Դϴ�");

				break;
				
		}
		
	}

}
