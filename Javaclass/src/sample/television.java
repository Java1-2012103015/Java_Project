package sample;

public class television {
	int channel; // TV�� ä��
	int volume;  // TV�� ����
	boolean onOff; // TV ON/OFF
	int light; // TV�� ���
	
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
	

