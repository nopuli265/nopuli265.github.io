package communityuni.com.model;

public class NhanVien {
private String ten;
private String ho;
private int soSP;
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getHo() {
	return ho;
}
public void setHo(String ho) {
	this.ho = ho;
}
public int getSoSP() {
	return soSP;
}
public void setSoSP(int soSP) {
	this.soSP = soSP;
}
public NhanVien(String ten, String ho, int soSP) {
	super();
	this.ten = ten;
	this.ho = ho;
	this.soSP = soSP;
	if (soSP< 0)
		this.soSP=0;
}
public double getLuong()
{
	double dongia=0;
	if (this.soSP<=199)
		dongia=0.5;
	else if (this.soSP<=399)
		dongia=0.55;
	else if (this.soSP<=599)
		dongia=0.6;
	else dongia=0.65;
	return this.soSP*dongia;
}
public boolean lonHon(NhanVien nv2)
{
	return this.soSP>nv2.soSP;
}
}
