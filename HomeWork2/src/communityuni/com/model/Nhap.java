package communityuni.com.model;

public class Nhap {
	
		public float gia;
		public String ten;
		public void setGia(float gia)
		{
			this.gia=gia;
		}
		public float getGia()
		{
			return this.gia;
		}
	//-----------------------------------------------------------------
		public void In(int a) {
			switch(a)
			{
			case 1:
				System.out.println("1. Coca-cola");
				break;
			case 2:
				System.out.println("2.Pepsi ");
				break;
			case 3 :
				System.out.println("3. Red Bull");
				break;
			case 4:
				System.out.println("4.Sprite ");
				break;
			default:
				System.out.println("Номер не найден");
			}
			System.out.println();
	//----------------------------------------------------------------------------------
		}

		public void menu() {
			System.out.println("управление склад: ");
			System.out.println("Справочник: ");
			System.out.println("1. Coca-cola -10$ ");
			System.out.println("2. Pepsi-20$");
			System.out.println("3. Red Bull-30$ ");
			System.out.println("4. Sprite-30$");
		}
		//----------------------------------------------------------------------
		public boolean isv(int ch) {
			if(ch<1|ch> 10 & ch != 'a') 
				return false;
			else return true;
		}
		//======================================================================
		public  Nhap( String ten, float gia)
		{
			this.ten=ten;
			this.gia=gia;
		}
		
		//------------------------------------------------------------------------
		public static float price(Nhap ... arr)
		{
			float max = 0;
			
			for (Nhap sp:arr)
			{
				if( sp.gia>max)
				{
					max= sp.gia;
				}
			}
			
			for(Nhap sp:arr)
			{
				if (sp.gia==max)
				{
					System.out.println(sp.ten+ " co gia lon nhat la"+ sp.gia);
				}
			}
			return max;
			
		}
		
		


		//--------------------------------------------------------
		
		public Nhap() {
			// TODO Auto-generated constructor stub
		}
		
	
}
