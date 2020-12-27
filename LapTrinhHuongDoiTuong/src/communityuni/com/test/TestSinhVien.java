package communityuni.com.test;

import communityuni.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien obama = new SinhVien();
		SinhVien putin=new SinhVien("ong putin",8);
		System.out.println("diem cua putin= "+putin.getDiem());//ko the lay putin.diem => dam bao tinh dong goi phi thong qua setter va getter
		System.out.println("ten putin="+putin.getHoTen());
		System.out.println("ten ong obama= "+obama.getHoTen());
		// doi ten ong obama
		obama.setHoTen("ong obama");
		System.out.println("ten obama="+ obama.getHoTen());
		// hai o nhow doc lap khong anh huong toi nhau, neu bên ông obama thay đổi thì bên ông putin không ảnh hưởng đến 
		putin.xuatThongTin();
		System.out.println("------------------------");
		System.out.println(obama);
	}

}
