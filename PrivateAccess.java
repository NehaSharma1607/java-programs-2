package package2;

class A{
	private void msg() {
		int m=4;
	}
}
public class PrivateAccess {
	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.msg());
	}
}
