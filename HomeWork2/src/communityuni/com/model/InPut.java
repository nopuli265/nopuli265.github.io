package communityuni.com.model;

public class InPut {
	public float gia;
	public String ten;
	public void In(int a) {
		switch(a)
		{
		case 1:
			System.out.println("1. Coca-cola");
			System.out.println("количество 100шт");
			System.out.println("цена 10руб.");
			break;
		case 2:
			System.out.println("2.Pepsi ");
			System.out.println("количество 200шт");
			System.out.println("цена 20руб.");
			break;
		case 3 :
			System.out.println("3. Red Bull");
			System.out.println("количество 150шт");
			System.out.println("цена 30руб.");
			break;
		case 4:
			System.out.println("4.Sprite ");
			System.out.println("количество 1000шт");
			System.out.println("цена 9руб.");
			break;
		case 5:
			System.out.println("5.Mountain Drew ");
			System.out.println("количество 10шт");
			System.out.println("цена 43руб.");
			break;
		case 6:
			System.out.println("6.Fanta");
			System.out.println("количество 900шт");
			System.out.println("цена 67руб.");
			break;
		case 7:
			System.out.println("7.kvac ");
			System.out.println("количество 102шт");
			System.out.println("цена 12руб.");
			break;
		case 8:
			System.out.println("8.milk");
			System.out.println("количество 50шт");
			System.out.println("цена 23руб.");

						break;
		case 9:
			System.out.println("9.Gatorade");
			System.out.println("количество 400шт");
			System.out.println("цена 29руб.");
			break;
		case 10:
			System.out.println("10.lipton");
			System.out.println("количество 456шт");
			System.out.println("цена 76руб.");
			break;
		default:
			System.out.println("Номер не найден");
		}
		System.out.println();
		//----------------------------------------------------------------------------------
	}

	public void menu() {
		System.out.println("список напитков в магазине: ");
		System.out.println("1. Coca-cola, 10руб. ");
		System.out.println("2. Pepsi, 20руб.");
		System.out.println("3. Red Bull, 30руб.");
		System.out.println("4. Sprite, 9руб.");
		System.out.println("5. Mountain Drew, 43руб.");
		System.out.println("6. Fanta,67руб.");
		System.out.println("7. kvac, 12руб.");
		System.out.println("8. milk, 23руб.");
		System.out.println("9. Gatorade , 29руб.");
		System.out.println("10. lipton, 76руб.");
	}
	//----------------------------------------------------------------------
	
	public  InPut( String ten, float gia)
	{
		this.ten=ten;
		this.gia=gia;
	}

	public InPut() {
		// TODO Auto-generated constructor stub
	}
	//------------------------------------------------------------------------
	public static float maxPrice(InPut ... arr)
	{
		float max = 0;

		for (InPut sp:arr)
		{
			if( sp.gia>max)
			{
				max= sp.gia;
			}
		}

		for(InPut sp:arr)
		{
			if (sp.gia==max)
			{
				System.out.println(sp.ten+ "  - самый дорогой товар, цена  " + sp.gia+" руб. ");
			}
		}
		return max;	
	}
	//--------------------------------------------------------

	public static float minPrice(InPut ... arr)
	{
		float min = 999999999;

		for (InPut sp:arr)
		{
			if( sp.gia<min)
			{
				min= sp.gia;
			}
		}

		for(InPut sp:arr)
		{
			if (sp.gia==min)
			{
				System.out.println(sp.ten+ " - Самый дешевый товар, цена "  + sp.gia+"  руб. ");
			}
		}
		return min;

	}
	
}
