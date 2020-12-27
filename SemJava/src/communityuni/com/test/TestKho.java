package communityuni.com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import communityuni.com.model.KhachHang;
import communityuni.com.model.MatHang;
import communityuni.com.model.MatHangMua;

public class TestKho {
	static ArrayList<MatHang>sp= new ArrayList<MatHang>();
	static ArrayList<MatHangMua> spm= new ArrayList<MatHangMua>();
	static KhachHang k;

	public static void menu()
	{
		System.out.println("1. Добавить товар на склад ");
		System.out.println("2. Экспорт список товаров на складе ");
		System.out.println("3. Проверка");
		System.out.println("4. Удалить товар");
		System.out.println("5. Найти товар");
		System.out.println("6. Купить товар");
		System.out.println("7. введите дополнительное количество товара(если количество товара< 50 шт)");
		System.out.println("8. Выход");
		System.out.println( " Что вы хотите? : ");
		int n= new Scanner(System.in).nextInt();
		switch (n)
		{
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			kiemtra();
			break;
		case 4:
			xoa();
			break;
		case 5:
			Tim();
			break;
		case 6:
			muahang();
			break;
		case 7:
			nhapthem();
			break;
		case 8:
			System.err.println("до свидания!");		
			System.exit(0);
			break;
		}
	}
	private static void nhapthem() {
		System.out.println("введите название товара, чтобы добавить количество:");
		String name= new Scanner(System.in).nextLine();
		System.out.println("ID товара :");
		int id= new Scanner(System.in).nextInt();
		boolean t=false;
		for(MatHang mh:sp)
		{
			if(mh.getId()==id)
			{
				System.out.println(" Количество дополнительных товаров: ");
				int sl= new Scanner(System.in).nextInt();		
				mh.setSl(mh.getSl()+sl);
				t=true;
				System.out.println("Обновлено!");
				break;
			}}

		if(t==false)
			System.err.println("Не найдено этот товар на складе!!");
	}

	/////////////////////////////////////////////////////////////////////////////////////
	public static  void muahang() {
		double s=0;
		System.out.println("введите имя покупателя:");
		String name= new Scanner(System.in).nextLine();
		System.out.println("введите адрес:");
		String address= new Scanner(System.in).nextLine();
		System.out.println("введите номер телефона покупателя:");
		String phone= new Scanner(System.in).nextLine();
		System.out.println("введите номер паспорта покупателя:");
		String id= new Scanner(System.in).nextLine();
		while(true) {

			System.out.println("какой товар вы хотите купить:");
			String name1= new Scanner(System.in).nextLine();
			System.out.println("введите id товара:");
			int id1= new Scanner(System.in).nextInt();
			System.out.println("Количество преобретающих товаров");
			int sl1= new Scanner(System.in).nextInt();
			int t=0;
			for(MatHang mh:sp)
			{
				if (mh.getId()==id1)
				{  
					t+=1;
					if(mh.getSl()<sl1)
				{
					System.err.println("Не достаточно товаров для продажи!");
					System.out.println("Количество товаров, оставшихся в наличии : " +mh.getSl());
				}
				else
				{
					mh.setSl(mh.getSl()-sl1); 
					System.out.println("Цена за единицу товара: "+ mh.getGia());

					k= new KhachHang(id, name, phone, address, spm);
					MatHangMua ds= new MatHangMua (id1, name1, sl1, mh.getGia());
					spm.add(ds);
					ds.tinhTong();
					
				}
				}
			}
			if(t==0)
			System.err.println("Не найдено этот товар на складе");
			System.out.println("Что-нибудь еще хотите приобрести?(yes/no) :");
			String line1= new Scanner(System.in).nextLine();
			if(line1.equalsIgnoreCase("no"))
				break;
		}
		for( MatHangMua dsm:spm)
			s+=dsm.getGia()*dsm.getSl();
		System.out.println("------------------------------------------------------------------");
		System.out.println("№ паспорта\tпокупатель\t адрес\t номер телефона");
		System.out.println(k);
		System.out.println("общая стоимость,которую " +k.getName()+" должен(должна) оплатить: "+s+ "руб.");
		System.out.println("------------------------------------------------------------------");


	}


	public static void Tim() {
		System.out.println("введите искомый товар:");
		String name= new Scanner(System.in).nextLine();
		System.out.println("введите ID товара");
		int id= new Scanner(System.in).nextInt();
		int i=0;
		for( MatHang mh:sp)
		{
			if(mh.getId()==id)
			{
				System.out.println("id\t Имя\t Год изготовления\tСрок годности(год)\tколичество\tЦена(руб.)");
				System.out.println(mh);
				i+=1;
			}}
		if(i==0)
			System.err.println("Нет этого товара");
		System.out.println("-----------------------------------------------------");
	}
	public static void xoa() {
		System.out.println("Необходимо удаленный этот товар: ");
		String name= new Scanner(System.in).nextLine();
		System.out.println("введите ID товара : ");
		int id= new Scanner(System.in).nextInt();
		int t=0;
		for(int i=0; i<sp.size();i++)
			if(sp.get(i).getId()==id)
			{sp.remove(i);
			System.out.println("удаление завершено!");
			t+=1;
			}
		if (t==0)
			System.err.println("Нет этого товара!");
		System.out.println("-----------------------------------------------------");

	}


	public static void kiemtra() {
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		int t=0;
		for( MatHang mh:sp)
		{
			if((yearNow-mh.getYear())>mh.getHansd())
				System.err.println(mh.getName()+" - ID_"+mh.getId() +" Просроченные продукты подлежит к полному уничтожению!!");
			else
			{
				if(mh.getSl()<50)
				{
					System.out.println(mh.getName()+" - ID_"+mh.getId() +" количесто товара < 50 шт => Необходимо дополнить!!");
					t+=1;
				}
			}}

		if(t==0)
			System.out.println("В хорошем состоянии!!");
		System.out.println("-----------------------------------------------------");

	}


	public static void xuat() {
		System.out.println("Список товаров в наличии:");		
		System.out.println("id\t Имя\t Год изготовления\tСрок годности(год)\tколичество\tЦена(руб.)");
		System.out.print(sp);
		System.out.println();
		System.out.println("-----------------------------------------------------");
	}

	public static void nhap() {
		System.out.println("введите ID товара: ");
		int id = new Scanner(System.in).nextInt();
		for(int i=0;i<sp.size();i++)
			if (id==sp.get(i).getId())
			{
				System.err.println("ID уже существует , введите другой ID");
				System.out.println("введите ID товара: ");
				id = new Scanner(System.in).nextInt();
				break;
			}
		System.out.println("введите имя товара: ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Введите год изготовления: ");
		int year = new Scanner(System.in).nextInt();
		System.out.println("Введите срок годности: ");
		int hansd = new Scanner(System.in).nextInt();
		System.out.println("Введите количество товара: ");
		int sl = new Scanner(System.in).nextInt();
		System.out.println("Введите цену");
		Double  gia= new Scanner(System.in).nextDouble();
		MatHang dssp= new MatHang(id, name, sl, hansd, gia,year);
		sp.add(dssp);
		System.out.println("-----------------------------------------------------");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Добро пожаловать к программному обеспечению для управления складом:");
		while(true)
		{
			menu();
		}


	}

}
