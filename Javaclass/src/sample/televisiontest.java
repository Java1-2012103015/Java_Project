package sample;

public class televisiontest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		television myTV = new television();
		television yourTV = new television();
		myTV.channel = 7;
		myTV.volume = 9;
		myTV.onOff = true;
		myTV.light = 15;
		myTV.pr();
		myTV.volume = myTV.volumeUP(30);
		yourTV.channel = 1;
		yourTV.volume = 12;
		yourTV.onOff = true;
		yourTV.light = 15;
		yourTV.pr();
		
		System.out.println("�ڷ����� ä����" + myTV.channel + "�̰� �ڷ����� ������" + myTV.volume + "�̰� �ڷ����� ����" + myTV.light + "�Դϴ�");
		System.out.println("�ڷ����� ä����" + yourTV.channel + "�̰� �ڷ����� ������" + myTV.volume + "�̰� �ڷ����� ����" + myTV.light + "�Դϴ�");

	}

}
