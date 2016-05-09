
public class midterm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; //100자리
		int s;	   //마지막자리
		int value; // 출력할 수
		for(i=8;i>6;i--){
			for(s=1;s<5;s++){
				value = i*100 + s;
				System.out.print(value + " ");
			}
			System.out.println(" ");//줄 넘기기
			
			}
		for(i=6;i>4;i--){
			for(s=1;s<7;s++){
				if (s ==4){
					value = i*100 + s + 2;
					System.out.print(value+ " ");}
				else{
				value = i*100 + s;
				System.out.print(value+ " ");}
			}
			System.out.println(" ");//줄 넘기기
			
			}
		for(i=3;i>=1;i--){
			for(s=1;s<7;s++){
				value = i*100 + s;
				System.out.print(value+ " ");
			}
			System.out.println(" ");//줄 넘기기
			
			}
		System.out.println("<<학번 : 2012103015>>");
		
			}
		
			
		
		}
		
	
	
	

