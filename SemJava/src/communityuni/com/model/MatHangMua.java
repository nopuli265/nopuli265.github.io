package communityuni.com.model;

import java.util.Scanner;

public class MatHangMua extends MatHang {
	double s;
public MatHangMua()
{
	super();
	
}
public MatHangMua( int id,String name, int sl, double gia )
{
	super( id, name,  sl, gia );
}
@Override

	
	public void tinhTong() {
 s= this.getSl()*this.getGia();
System.out.println(this.getSl()+" шт "+this.getName()+" по цене "+s+" руб.");	}
public String toString() {
	// TODO Auto-generated method stub
	return this.getId()+  "\t        " + this.getName()+"\t    "+this.getSl()+"\t       "+this.getGia()+"\t        "+s+"\n";
}
}
