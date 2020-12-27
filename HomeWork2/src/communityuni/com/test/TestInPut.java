package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.InPut;
import communityuni.com.model.Nhap;

public class TestInPut {

	public static void main(String[] args)
			throws java.io.IOException{
		InPut sp= new InPut();
		InPut sp1 = new InPut("coca-cola",10);
		InPut sp2 = new InPut("pesi",20);
		InPut sp3= new InPut("Red Bull",670);
		InPut sp4 = new InPut("Sprite",9);
		InPut sp5 = new InPut("Mountain Drew",3);
		InPut sp6 = new InPut("Fanta",67);
		InPut sp7 = new InPut("kvac",12);
		InPut sp8 = new InPut("milk",23);
		InPut sp9 = new InPut("Gatorade",29);
		InPut sp10 = new InPut("lipton",234);

		sp.menu();

		float max= InPut.maxPrice (sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10);

		float min=InPut.minPrice(sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10);

		Scanner sc= new Scanner(System.in);	
		System.out.println("-----------------------------------");
		float tong1,tong2,tong3,tong4,tong5,tong6,tong7,tong8,tong9,tong10 ;
		 tong1=tong2=tong3=tong4=tong5=tong6=tong7=tong8=tong9=tong10=0;

		while(true)
		{
			
			System.out.print("moi nhap so n=");
			int a = sc.nextInt();
			sp.In(a);
			System.out.println("----------------------");
			System.out.print(" количество хотите купить :");
			int b= sc.nextInt();
			System.out.println("скидка :" );
			float c = sc.nextFloat();
			if (a==1)
			{ tong1=sp1.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong1 + " руб.");}
			if (a==2)
			{ tong2=sp2.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong2+ " руб.");}
			
			if (a==3)
			{ tong3=sp3.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong3 + " руб.");}	
			if (a==4)
			{ tong4=sp4.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong4 + " руб.");}	
			if (a==5)
			{ tong5=sp5.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong5 + " руб.");}	
			if (a==6)
			{ tong6=sp6.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong6 + " руб.");}	
			if (a==7)
			{ tong7=sp7.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong7 + " руб.");}	
			if (a==8)
			{ tong8=sp8.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong8 + " руб.");}	
			if (a==9)
			{ tong9=sp9.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong9 + " руб.");}	
			if (a==10)
			{ tong10=sp10.gia*b*((100-c)/100);
			System.out.println("оплатить c скидкой: "+ tong10 + " руб.");}		
			System.out.print("Вы хотите продолжить?(да/нет)?");
			String line1= new Scanner(System.in).nextLine();
			if(line1.equalsIgnoreCase("нет"))
				break;

		}
		System.out.println("всего к оплате:" + (tong1+tong2+tong3+tong4+tong5+tong6+tong7+tong8+tong9+tong10)+ " руб.");
		System.out.println("Спасибо за использование программы!");
		System.out.println("goodbye!");

	}
}
