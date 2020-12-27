package communityuni.com.model;

public class Employee extends StaffMember{
	protected String socialSecurtityNumber;
	protected double payRate;

	public String getSocialSecurtityNumber() {
		return socialSecurtityNumber;
	}
	public void setSocialSecurtityNumber(String socialSecurtityNumber) {
		this.socialSecurtityNumber = socialSecurtityNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "_" + socialSecurtityNumber+"_" +payRate;
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 500;
	}

}
