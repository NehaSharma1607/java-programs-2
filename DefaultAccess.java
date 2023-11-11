package package2;
import my_package.*;
class B{
	int a=56;
}
public class DefaultAccess extends B {
	public static void main(String[] args) {
		DefaultAccess obj=new DefaultAccess();
		System.out.println(obj.a);
	}

}
