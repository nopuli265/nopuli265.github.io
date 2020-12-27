package communityuni.com;

public class Ex4r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4 bigQ= new Ex4(100);
		Ex4 smallQ = new Ex4(4);
		int ch;
		int i;
		for(i=0; i<6; i++)
		{
			bigQ.put(i);
			System.out.println();
		}
		System.out.println(" содержимое очереди bigQ: ");
		for(i=0; i<6;i++)
		{
			ch=bigQ.get(i);
				System.out.print(ch+"\t");
		}
		System.out.println();
		System.out.println(" программа их отсортировала по возрастанию:");
		bigQ.Sapxep();
		for(i=0;i<6; i++)
		{
			ch=bigQ.get(i);
			System.out.print(ch+" ");
		}
		System.out.println();

		for(i=0; i<5; i++)
		{
			smallQ.put(i);
			System.out.println();
		}
		System.out.print(" содержимое очереди smallQ: ");
		for(i=0;i<5; i++)
		{
			ch=smallQ.get(i);
			System.out.print(ch+" ");
		}
		
		System.out.println();

		smallQ.minMax();
		smallQ.tb();

	}
}


