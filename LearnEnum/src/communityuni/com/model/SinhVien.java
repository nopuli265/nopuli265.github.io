package communityuni.com.model;

public class SinhVien {
	private int ma;
	private String ten;
	private double diem;
	private XepLoai loai;
	
	public SinhVien(int ma, String ten, double diem) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diem = diem;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public XepLoai getLoai() {//khong co setloai vi phu thuoc vao diem
		if (this.diem>=8)
			loai=XepLoai.Gioi;
		else if (this.diem >= 6.5)
			loai= XepLoai.kha;
		else if (this.diem>5)
			loai=XepLoai.tb;
		else 
			loai= XepLoai.yeu;
		return loai;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.ma+"\t"+this.ten+"\t"+this.diem+ "+==> xep loai" + this.getLoai().description();
}
}
