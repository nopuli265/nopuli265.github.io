package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.model.Man;
import communityuni.com.model.Person;
import communityuni.com.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Person>dsPerson= new ArrayList<Person>();
Person an= new Man();
an.setFirstName("AN");
Person hong = new Woman();
hong.setFirstName("nguyeen hong");
((Woman)hong).setWearingMakeup(true);//ep kieu

dsPerson.add(an);
dsPerson.add(hong);
for (Person p:dsPerson)
{
	if (p instanceof Man)
		System.out.println(p.getFirstName()+" la nam");
	else if (p instanceof Woman)
		System.out.println(p.getFirstName()+ " la nu");
}
	}

}
