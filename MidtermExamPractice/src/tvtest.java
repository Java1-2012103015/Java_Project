import java.util.Scanner;

public class tvtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		tvoriginal mytv = new tvoriginal();
		mytv.light = 10;
		mytv.channel = 11;
		mytv.volume = 11;
		System.out.println("���� ������ �Է��ϼ���");
		int i = input.nextInt();
		mytv.Volumeup(i);
		mytv.now();
		

	}

}
