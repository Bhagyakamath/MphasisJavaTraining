package p2;
import p1.Exp1;
public class Exp4 {
	Exp1 e4=new Exp1();
	public void dis() {
//		System.out.println(e4.pinNo);
//		System.out.println(e4.phone);
//		System.out.println(e4.wifip);
		System.out.println(e4.citypin);
	}
}
class Exp5 extends Exp1{
	public void dis() {
//		System.out.println(pinNo);
//		System.out.println(phone);
		System.out.println(wifip);
		System.out.println(citypin);
	}
}
