import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary,total;
		int year = 10, month = 12;
		Scanner input = new Scanner(System.in);
		System.out.println("Type your Salary");
		salary = input.nextInt();
		total = salary*year*month;
		System.out.println("Total Salary is"+total+"(tot = salary * 12months * 10 years)");
		

	}

}
