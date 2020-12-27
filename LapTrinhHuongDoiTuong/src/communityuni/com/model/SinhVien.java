package communityuni.com.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	public void setHoTen(String hoTen)
	{
		this.hoTen=hoTen;	
	}
	public String getHoTen()
	{
		return this.hoTen;
	}
	public void setDiem(double diem)
	{
		this.diem=diem;
		
	}
	public double getDiem()
	{
		return this.diem;
	}
	public SinhVien(String hoTen, double diem)//construstor co doi so
	{
		this.hoTen=hoTen;
		this.diem= diem;
		System.out.println("day la construstor co doi so");
	}
public SinhVien()
{
	System.out.println("day la constructor mac dinh");
	
}
public void xuatThongTin()
{
	System.out.println(this.hoTen+"->"+this.diem);
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return"HoTen= " +this.hoTen+ "\ndiem= "+this.diem;
}
	
}
