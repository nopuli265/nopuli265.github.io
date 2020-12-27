package comunityuni.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestNhapDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal = Calendar.getInstance();
int yearNow = cal.get(Calendar.YEAR);
Date t= cal.getTime();
System.out.println("ngay hom nay la");
System.out.println(t);
System.out.println("moi ban nhap ngay thang nam sinh cua minh(dd/MM/yyyy):");
String ns= new Scanner (System.in).nextLine();
SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
try {
	Date birthday= sdf.parse(ns);
	cal.setTime(birthday);
	int nam= cal.get(Calendar.YEAR);
	int tuoi= yearNow- nam;
	System.out.println("ban" + tuoi+ "tuoi");
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
