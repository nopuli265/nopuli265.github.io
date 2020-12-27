package comunityuni.com.model;

public class Square extends Triangle{
//квадрат
	public Square()
	{
		super();
	}
	public Square(double width)
	{
		super(width);
	}
	public void tinhChuVi() {
		 System.out.println(" периметр=" +(this.getWidth()*4));
	}
	public void tinhdientich() {
		 System.out.println(" площадь=" +this.getWidth()*this.getWidth() );
	}
}
