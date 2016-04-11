package sample;

public class televisiontest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		television myTV = new television();
		myTV.channel = 7;
		myTV.volume = 9;
		myTV.onOff = true;
		myTV.light = 15;
		
		System.out.println("텔레비전 채널은" + myTV.channel + "이고 텔레비전 볼륨은" + myTV.volume + "이고 텔레비전 밝기는" + myTV.light + "입니다");
		

	}

}
