
public class AnonymousClassTest {

	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl(){
			public void turnOn(){
				System.out.println("TV turn On()");
			}
			public void turnOff(){
				System.out.println("TV trunOff(");}

	};
	ac.turnOn();
	ac.turnOff();

}}
