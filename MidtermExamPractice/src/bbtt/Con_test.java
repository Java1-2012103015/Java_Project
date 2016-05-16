package bbtt;
class Par{
	Par(){System.out.println("Par con");}
}
	par(int x){System.out.println("Par con"+x);}
class child extends Par {

	public child(int y) {
		super(4);
		System.out.println("child con");
		// TODO Auto-generated constructor stub
	}
	//child(){System.out.println("child con");}
	
}
public class Con_test {
	public static void main(String[] args){
		child c1 = new child();
	}
}
