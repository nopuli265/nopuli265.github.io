package communityuni.com.model;

import java.util.ArrayList;

public class KhachHang {
protected String id;
protected String name;
protected String phone;
protected String address;

private ArrayList<MatHangMua> spm;

public ArrayList<MatHangMua> getSpm() {
	return spm;
}
public void setSpm(ArrayList<MatHangMua> spm) {
	this.spm = spm;
}
protected String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public KhachHang(String id, String name, String phone, String address, ArrayList<MatHangMua> spm) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.address = address;
	this.spm = spm;
}
public KhachHang() {
	super();
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+this.id +"\t  "+ this.name +"\t  "+ this.address+"\t  "+this.phone+"\n"+
				"id товара\tтовар\tколичество\tцена(1шт)\tсумма"+"\n"+this.spm;
	}


}
