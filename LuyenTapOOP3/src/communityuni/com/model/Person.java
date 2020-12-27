package communityuni.com.model;

import java.util.Date;

public abstract class Person implements Mammal {
	private String firstName;
	private Bloodgroup blood;
	private Address homeAddress;
	private Address schoolAddress;

	public Bloodgroup getBlood() {
		return blood;
	}

	public void setBlood(Bloodgroup blood) {
		this.blood = blood;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setDatOfBirth(Date dob) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAgesAsDays() {
		// TODO Auto-generated method stub
		return 0;
	}

}
