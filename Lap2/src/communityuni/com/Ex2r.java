package communityuni.com;

public class Ex2r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ex2 bigQ = new Ex2(100);
			Ex2 smallQ= new Ex2(4);
			int arr[]=new int[10];
			int ch;
			int i;
			for(i=0; i<10; i++)
			{
				bigQ.put(i);
			   arr[i]=bigQ.get();
				System.out.println();
			}
			System.out.println(" использование очереди bigQ для сохранения число тип int");
			System.out.print(" содержимое очереди bigQ: ");
			for(i=0;i<10; i++)
			{
					System.out.print(arr[i]+"\t");
			}
			System.out.println("\n");
			
			System.out.println(" использование очереди smallQ для генерации ошибок");
			for (i=0; i<5; i++)
			{
				System.out.println(" Попытка сохранения "+i);
				smallQ.put(i);
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

	


