import java.util.Scanner;

public class arraytest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count, score, avg, tot;
		tot = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("학생들 성적을 배열에 저장하고 평균 내는프로그램");
		System.out.println("학생은 몇명?");
		i = input.nextInt();
		int[] s = new int[i];
	
		
		
		for(count = 0;count<s.length;count++){
			System.out.println(count+1 + "번 학생 성적을 입력하세요");
			s[count]=input.nextInt();					
			tot = tot + s[count];
			}
		
		avg = tot/i;
		System.out.println("성적 평균은 " + avg);
	}

}
