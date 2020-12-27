package communityuni.com;

public class EX2_2r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2_2 bigQ = new Ex2_2(100);
		Ex2_2 smallQ= new Ex2_2(4);
		double arr[]= new double[10];
		double ch;
		int i;
		System.out.println(" использование очереди bigQ для сохранения число тип double ");
		for(i=0; i<10; i++)
		{
			bigQ.put(i);
			System.out.println(bigQ.get());
			arr[i]=bigQ.get();
			System.out.println();
		}

		System.out.print(" содержимое очереди bigQ: ");
		for(i=0;i<10; i++)
		{
		System.out.print(arr[i]+"\t");
		}
		
		System.out.println("\n");
		System.out.println(" использование очереди smallQ для генерации ошибок");
		for (i=0; i<5; i++)
		{
			smallQ.put(i);
			System.out.println(" Попытка сохранения "+ smallQ.get());
				arr[i]=smallQ.get();
				System.out.println();
		}
		System.out.println();
		System.out.print(" содержимое smallQ: ");
		for(i=0; i<5; i++)
		{
				System.out.print(arr[i]+"\t");
		}
	}

}
