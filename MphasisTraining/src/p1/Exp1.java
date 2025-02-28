package p1;

public class Exp1 {
	//Example of package
	private int pinNo=34567;
	int phone=234567891;
	protected int wifip=5678;
	public int citypin=500098;

	public static void main(String[] args) {
		Exp1 e=new Exp1();
		e.dis();

	}
	public void dis() {
		System.out.println(pinNo);
		System.out.println(phone);
		System.out.println(wifip);
		System.out.println(citypin);
	}

}
class Exp2 extends Exp1{
	public void dis() {
//		System.out.println(pinNo);
		System.out.println(phone);
		System.out.println(wifip);
		System.out.println(citypin);
	}
}
class Exp3{
	Exp1 e1=new Exp1();
	public void dis() {
//		System.out.println(e1.pinNo);
		System.out.println(e1.phone);
		System.out.println(e1.wifip);
		System.out.println(e1.citypin);
	}
}
