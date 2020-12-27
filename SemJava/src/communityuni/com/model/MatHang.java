package communityuni.com.model;

import java.util.Date;
import java.util.Scanner;

public class MatHang {
	private int id;
	 private String name;
	 private int sl;
	 private int hansd;
	 private double gia;
	private int year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getHansd() {
		return hansd;
	}
	public void setHansd(int hansd) {
		this.hansd = hansd;
	}
	
	public void get(String name) {
		if (this.name==name)
			System.out.println("co tim thay sp nay");
		else
			System.out.println("khong tim thay");
		return;
	}
	public MatHang(String name) {
		super();
		this.name = name;
	}
	public MatHang(int id, String name, int sl, int hansd, double gia, int year) {
		super();
		this.id = id;
		this.name = name;
		this.sl = sl;
		this.hansd = hansd;
		this.gia = gia;
		this.year = year;

	}

	public MatHang() {
		super();
	}
	
	public MatHang(int id, String name, int sl, double gia) {
		super();
		this.name = name;
		this.sl = sl;
	this.id=id;
	this.gia=gia;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub   
		return this.id+" \t " +this.name+    " \t        "+this.year+"\t              "+this.hansd+"\t                  "+this.sl+"\t            "+this.gia+"\n";
	}
	public void tinhTong() {
		//System.out.println("tong gia thanh san pham la:"+ this.gia*this.sl);
	}
}
