package bai1;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) 	throws java.io.IOException{
		
		String line= "car";
		while(true)
		{
			System.out.println("слово состоит из 3 букв");
			System.out.println("я загадал слово");
			System.out.println(" тебе подсказать первую букву?");
			String d = new Scanner(System.in).nextLine();
			if(d.equalsIgnoreCase("yes"))
				System.out.println("первая буква это С");
			
			System.out.println(" тебе подсказать вторую букву?");
			String h = new Scanner(System.in).nextLine();
			if(h.equalsIgnoreCase("yes"))
				System.out.println("вторая буква это a");
			
			System.out.println("тебе подсказать третью букву? ");
			String к = new Scanner(System.in).nextLine();
			if(к.equalsIgnoreCase("yes"))
				System.out.println("третья буква это r");
			
			System.out.println("Попробуй угадать");
			Scanner sc= new Scanner(System.in);
			String ch= sc.nextLine();
			if (ch.equalsIgnoreCase("car"))
				{System.out.println("ты угадал!");
			    break; }
			else
			{
				System.out.println("сожалею, ты ошибся");
				System.out.print("Вы хотите продолжить?(да/нет)?");
				String line1= new Scanner(System.in).nextLine();
				if(line1.equalsIgnoreCase("нет"))
					break;
			}
		}
	}
}