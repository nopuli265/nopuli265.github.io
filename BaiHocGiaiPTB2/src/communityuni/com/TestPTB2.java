package communityuni.com;

import java.util.Scanner;

public class TestPTB2 {
	/**
	 * giai phuong trinh bac 2 ax^2 + bx +c =0
	 * @param a-he so a
	 * @param b- he so b
	 * @param c- he so c
	 */
	
public static void giaiPTB2(double a, double b, double c)
{
	if (a==0)
	{
		System.out.println("day la phuong trinh bac 1");
		if (b==0 && c!=0)
		{
			System.out.println("phuong trinh vo nghiem");
		}
		else if (b==0 && c==0)
		{
			System.out.println("phuong trinh vo so nghiem");
		}
		else
		{
			System.out.println("phuong trinh co nghiem x = " + (-c/b));
		}
	}
	else
	{
		double delta= b*b-4*a*c;
		if (delta < 0)
		{
			System.out.println("phuong trinh vo nghiem");
			
		}
		else if ( delta ==0)
		{
			System.out.println(" phuowng trinh co nghiem kep x1=x2= " +(-b/2*a));
		}
		else
		{
			double x1 = (-b - Math.sqrt(delta))/(2*a);
			double x2 = (-b + Math.sqrt(delta))/(2*a);
			System.out.println("pt co hai nghiem \n x1 = "+ x1 +" \n x2= "+x2);
					
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("giai phuong trinh bac 2");
Scanner sc= new Scanner(System.in);
do {
System.out.print("moi ban nhap he so a = ");
double a = sc.nextDouble();
System.out.print("moi ban nhap he so b= ");
double b= sc.nextDouble();
System.out.print("moi nhap he so c = ");
double c= sc.nextDouble();
giaiPTB2(a,b,c);
System.out.println("tieps tuc khong?");
String line = new Scanner(System.in).nextLine();
if (line.equalsIgnoreCase("k"))
	break;
}
while (true);
System.out.println(" thanks!");
	}

}
