package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {

	

	public NhanVienChinhThuc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienChinhThuc(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		
		System.out.println("nhan vien chinh thuc "+this.getTen()+" goi tinh luong");
	}

	

	}


