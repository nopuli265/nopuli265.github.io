package comunityuni.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal=Calendar.getInstance();
int year=cal.get(Calendar.YEAR);
System.out.println(year);
int day = cal.get(Calendar.DAY_OF_MONTH);
System.out.println(day);
Date t= cal.getTime();
SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
System.out.println(sdf.format(t));

SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
System.out.println(sdf1.format(t));
SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy hh:mm:ss:aaa");
System.out.println(sdf2.format(t));
	}

}
