package package2;
import my_package.*;

public class PublicAccess extends BooleanDataType {
	int a=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicAccess obj=new PublicAccess();
		System.out.println(obj.a);
		obj.msg();

	}

}
