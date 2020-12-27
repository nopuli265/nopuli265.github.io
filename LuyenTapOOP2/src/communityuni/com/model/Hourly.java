package communityuni.com.model;

public class Hourly extends Employee{

	private int hoursWorked;
	public void addHours(int hoursWorked)
	{
		this.hoursWorked= hoursWorked;
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return this.hoursWorked*50;// moi h nhận 50 nghìn
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
