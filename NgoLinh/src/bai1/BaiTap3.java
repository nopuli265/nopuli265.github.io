package bai1;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int riders[]= new int[7];
int tong[]=new int[7];
Scanner sc= new Scanner(System.in);
int i,j;
for (i=0; i<7; i++)
		{System.out.print("riders["+i+"]= ");
		riders[i]=sc.nextInt();
		}
for(i=0;i<7;i++)
		tong[i]=riders[i]*25;
System.out.println("цена/билет:25 руб.");
System.out.println("---------------------------------------------");
System.out.println(" пассажиров за поездку в недели: ");
System.out.println("понедельник:"+riders[0]+ " пассажиров выручка: "+ tong[0]+" руб");
System.out.println("вторник:"+riders[1]+ " пассажиров выручка: "+ tong[1]+" руб");
System.out.println("среда:"+riders[2]+ "  пассажиров выручка: "+ tong[2]+" руб");
System.out.println("четверг:"+riders[3]+ " пассажиров  выручка: "+ tong[3]+" руб");
System.out.println("пятница:"+riders[4]+ " пассажиров выручка: "+tong[4]+" руб");
System.out.println("суббота:"+riders[5]+ " пассажиров выручка: "+ tong[5]+" руб");
System.out.println("воскресеник:"+riders[6]+ " пассажиров выручка: "+ tong[6]+" руб");
System.out.println("---------------------------------------------");

int max=tong[0];int min=tong[0];
for (i=0;i<7;i++)
{
	if (max<tong[i])
		max=tong[i];
}
System.out.println("максимальная выручка:"+max+" руб");

for (i=0;i<7;i++)
{
	if (min>tong[i])
		min=tong[i];
}
int sum=0;
for(i=0;i<7;i++)
	{sum+=tong[i];}

System.out.println(" минимальная выручка: "+ min +" руб");
System.out.println(" средная выручка: "+(sum/7)+" руб");
Arrays.sort(tong);
System.out.println("-----------------------------------");
	System.out.println("выручка по возрастанию: ");
for(i=0;i<7;i++)
	System.out.println(+tong[i]+" руб");
	}
}
