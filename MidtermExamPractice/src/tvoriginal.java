
public class tvoriginal {


	int volume;
	int channel;
	int light;
	boolean onOff;
	String color;
	void Volumeup(int data){
		volume = volume + data;
		System.out.println("ÇöÀç º¼·ý" + volume);
	}
	void now(){
		System.out.println("  º¼·ý   " + volume + "  Ã¤³Î  " + channel + "  ¹à±â  " + light);
	}
			
		
		

	

}
