package comunityuni.com.test;
import java.util.Scanner;

import comunityuni.com.model.HinhChuNhat;
import comunityuni.com.model.HinhTron;
import comunityuni.com.model.Rhombus;
import comunityuni.com.model.Square;
import comunityuni.com.model.Triangle;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("menu:");
		System.out.println("1. прямоугольник ");
		System.out.println("2. квадрат ");
		System.out.println("3. ромб");
		System.out.println("4.Пифагора");
		System.out.println("5. окружность");
		while(true) {
		System.out.println( " Что вы хотите? : ");
		int n= new Scanner(System.in).nextInt();
		switch (n)
		{
		case 1:
			System.out.println("===========");
			System.out.println("прямоугольник шириной a = ");
			double a= new Scanner(System.in).nextDouble();
			System.out.println("прямоугольник длиной b = ");
			double b= new Scanner(System.in).nextDouble();
			Triangle h= new HinhChuNhat(a, b);
			System.out.println("прямоугольник  шириной a = " +h.getWidth()+", длиной b = " + h.getHeight()+ " :");
			h.tinhChuVi();
			h.tinhdientich();
			break;
		case 2:
			System.out.println("===========");
			System.out.println("квадрат имеет длину x = ");
			Triangle kva= new Square(6);
			double x= new Scanner(System.in).nextDouble();
			kva.tinhChuVi();
			kva.tinhdientich();
			break;
		case 3:
			System.out.println("===========");
			System.out.println("ромб шириной a = ");
			double a1= new Scanner(System.in).nextDouble();
			System.out.println("ромб высотой h = ");
			double h1= new Scanner(System.in).nextDouble();
			 Triangle r = new Rhombus(a1,h1);
			r.tinhChuVi();
			r.tinhdientich();	
			break;
		case 4:
			System.out.println("===========");
			System.out.println("===========");
			System.out.println(" a = ");
			double a2= new Scanner(System.in).nextDouble();
			System.out.println(" b = ");
			double b2= new Scanner(System.in).nextDouble();

			Triangle tg= new Triangle(a2,b2);
			tg.pitagol();
			break;
		case 5:
			System.out.println("===========");
			System.out.println(" круг радисуа равно R= ");
			double R= new Scanner(System.in).nextDouble();
			Triangle tr= new HinhTron(R);
			System.out.println("окружность: ");
			tr.tinhChuVi();
			tr.tinhdientich();
			break;
		}
		System.out.println("Что-нибудь еще хотите ?(yes/no) :");
		String line1= new Scanner(System.in).nextLine();
		if(line1.equalsIgnoreCase("no"))
			break;
	}
		System.out.println(" bye!");
	}

	
	
		
		
		

		
		
		
		
		
	}


