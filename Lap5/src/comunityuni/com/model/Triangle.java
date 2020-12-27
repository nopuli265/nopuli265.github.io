package comunityuni.com.model;

public class Triangle {
	private double width;
	private double height;
	private double t;
	public Triangle() {
	
	}

	public Triangle(double width) {
		
		this.width = width;
	}

	public Triangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void pitagol()
	{
		System.out.println("это прямоугольный треугольник");
		System.out.println("Катетов : " + width + " и " + height);
		t= Math.sqrt(width*width+height*height);
		System.out.println("гипотенузы (через теорему Пифагора)= "+t);
	}
	
	public void tinhdientich() {
	
	}

	public void tinhChuVi() {
		
	}
	 
}
