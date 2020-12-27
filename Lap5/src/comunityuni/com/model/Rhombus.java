package comunityuni.com.model;

public class Rhombus extends Triangle {
	//ромб
	public Rhombus() {
		super();
	}

	public Rhombus(double width, double height) {
		super(width, height);
	}
	@Override
	public void tinhChuVi() {
		 System.out.println(" периметр=" +(+this.getWidth()*4 ));
	}

	@Override
	public void tinhdientich() {
		 System.out.println(" площадь=" +this.getHeight()*this.getWidth() );
	}
	
}
