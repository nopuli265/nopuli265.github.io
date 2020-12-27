package communityuni.com.test;

import communityuni.com.model.Employee;
import communityuni.com.model.Executive;
import communityuni.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st= new Staff();
		Employee linh= new Employee();
		linh.setName("ngo thi phuong linh");
		linh.setAddress("viet nam");
		linh.setPhone("13242");
		linh.setPayRate(0.12);//ti le
		linh.setSocialSecurtityNumber("sec1234");
		st.addStaffMember(linh);
		Employee lina= new Employee();
		lina.setName("lina nguyen");
		lina.setAddress("russian");
		lina.setPhone("242");
		lina.setPayRate(0.2);//ti le
		lina.setSocialSecurtityNumber("sec34");
		st.addStaffMember(lina);

		Executive an= new Executive();
		an.setName("ngo van an");
		an.setAddress(" han quoc ");
		an.setPhone("56789");
		an.setPayRate(0.14);//ti le
		an.setSocialSecurtityNumber("sec123455");
		an.awardBonus(100);
		st.addStaffMember(an);
		st.payDay();
	}
}