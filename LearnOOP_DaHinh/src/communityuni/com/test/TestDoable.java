package communityuni.com.test;

import communityuni.com.model.IDoable;
import communityuni.com.model.Nhanvien;
import communityuni.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IDoable x;
x= new Nhanvien();
x.doSomething();
x= new SinhVien();
x.doSomething();
	}

}
