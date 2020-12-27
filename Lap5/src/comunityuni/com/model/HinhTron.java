package comunityuni.com.model;

public class HinhTron extends Triangle {
	//окружность 
public HinhTron() {
	super();
}
public HinhTron(double width)
{
	super(width);
}

@Override
public void tinhChuVi() {
	 System.out.println(" периметр=" +(2*this.getWidth()*Math.PI ));
}

@Override
public void tinhdientich() {
	 System.out.println(" площадь=" +this.getWidth()*this.getWidth()*Math.PI );
}
}
