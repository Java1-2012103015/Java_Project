import java.util.Scanner;

public class arraytest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count, score, avg, tot;
		tot = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("�л��� ������ �迭�� �����ϰ� ��� �������α׷�");
		System.out.println("�л��� ���?");
		i = input.nextInt();
		int[] s = new int[i];
	
		
		
		for(count = 0;count<s.length;count++){
			System.out.println(count+1 + "�� �л� ������ �Է��ϼ���");
			s[count]=input.nextInt();					
			tot = tot + s[count];
			}
		
		avg = tot/i;
		System.out.println("���� ����� " + avg);
	}

}
