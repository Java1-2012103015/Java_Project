
public class Car0502 {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers = 0;
	
	public Car0502 (String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers;
		
	}
	int Car_Numbers(){
		return numbers;
	}
}
