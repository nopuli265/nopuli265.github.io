package comunityuni.com.model;

public class HinhChuNhat extends Triangle{
	//прямоугольник
	public HinhChuNhat() {
super();
	}
public HinhChuNhat(double width, double height) {
	super(width,height);
}
@Override
public void tinhChuVi() {
	 System.out.println(" периметр=" +(this.getHeight()+this.getWidth())*2 );
}

@Override
public void tinhdientich() {
	 System.out.println(" площадь=" +this.getHeight()*this.getWidth() );
}

}
