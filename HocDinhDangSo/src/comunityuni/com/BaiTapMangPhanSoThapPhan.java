package comunityuni.com;

import java.util.Scanner;

public class BaiTapMangPhanSoThapPhan {
	//Написать программ который массив испольняет для нахождения арифметического десятичных дробей
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("n= ");
		int n= sc.nextInt();
		
		float [] arr= new float[n];
		for (int i=0;i<arr.length;i++)
		{
			System.out.print("arr[" +i+"]= ");
			arr[i]=sc.nextFloat();
		}
		//----------------------------------------------------------
		System.out.println("массив А:");
		for (int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print("\t");
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("арифметические десятичные дроби в массиве A: ");
		int s = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]!= (int)(arr[i]))
			{
				System.out.print(arr[i]);
				System.out.print("\t");
			}
			else 
				s =s+1;
		}
		if (s==arr.length)
			System.out.println("в массиве нет десятичных дробей");
	}

}
