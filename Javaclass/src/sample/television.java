package sample;

public class television {
	int channel; // TV의 채널
	int volume;  // TV의 음량
	boolean onOff; // TV ON/OFF
	int light; // TV의 밝기
	
	void pr() {
		System.out.println(channel+""+volume+""+onOff);}
	void volumeUP(int data){
		if(onOff==false){
			System.out.println("TV Die");
			return;
			}
		volume+=data;}
		
	void volumeUP(){
		if(onOff == false) {
			System.out.println("TV Die");
			return;
		
	}
		volume+=1;
		}
		
	}
	

