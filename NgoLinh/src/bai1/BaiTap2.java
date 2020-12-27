package bai1;

public class BaiTap2 {
	double tong,tong1, tong2,tong3,tong4,tong5;
	public BaiTap2() {
		super();
	}
	public void In( String ten, double soluong) {
		switch(ten)
		{
		case "audi":
			System.out.println("car: audi ");
			System.out.println("цена/день 1500руб.");
			System.out.println("количество дней, на которое вы хотете взять машину "+ soluong+ " дней");
			tong1=soluong*1500;
			System.out.println(" оплата аренды машину в салоне: " +soluong*1500+ " руб");
			break;
		case "honda":
			System.out.println("car: honda ");
			System.out.println("цена/день 550руб.");
			System.out.println(" оплата аренды машину в салоне: " +soluong*550+ " руб");
			System.out.println("количество дней, на которое вы хотете взять машину "+ soluong+ " дней");
			tong2=soluong*550;

			break;
		case "mecerdes":
			System.out.println("car: mecerdes ");
			System.out.println("цена/день 1000руб.");
			System.out.println(" оплата аренды машину в салоне: " +soluong*1000+ " руб");
			System.out.println("количество дней, на которое вы хотете взять машину "+ soluong+ " дней");
			tong3=soluong*1000;

			break;
		case "toyota":
			System.out.println("car:toyota ");
			System.out.println("цена/день 500руб.");
			System.out.println(" оплата аренды машину в салоне: " +soluong*500+ " руб");
			System.out.println("количество дней, на которое вы хотете взять машину "+ soluong+ " дней");
			tong4=soluong*500;

			break;
		case "kia":
			System.out.println("car: kia ");
			System.out.println("цена/день 700руб.");
			System.out.println(" оплата аренды машину в салоне: " +soluong*700+ " руб");
			System.out.println("количество дней, на которое вы хотете взять машину "+ soluong+ " дней");
			tong5=soluong*700;

			break;
		default:
			System.out.println("машина не найден");
		}
		System.out.println();
	}
	public void tongTien()
	{
		tong= tong1+tong2+tong3+tong4+tong5;
		System.out.println("всего к оплате: "+tong+"руб");
	}
	public void menu() {
System.out.println("menu:");
System.out.println("1.audi");
System.out.println("2.honda");
System.out.println("3. mecerdes ");
System.out.println("4.toyota");
System.out.println("5.kia");
System.out.println(" какую машину вы хотите:");
}

}
