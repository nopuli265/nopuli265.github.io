package communityuni.com;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 bigQ = new Example1(100);
		Example1 smallQ= new Example1(4);
		char ch;
		int i;
		char arr[]= new char[26];
		char ar[]= new char[5];

		System.out.println(" использование очереди bigQ для сохранения алфавита ");
		for(i=0; i<26; i++)
		{
			System.out.println("сохранения "+ (char) ('A'+i));
			bigQ.put((char)('A'+i));
			arr[i]= bigQ.get();
			System.out.println();
		}

		System.out.print(" содержимое очереди bigQ: ");
		for(i=0;i<26; i++)
		{
			/*ch= bigQ.get();
			if (ch!=(char) 0)*/
				System.out.print(arr[i]+"\t");
		}
		System.out.println("\n");
		System.out.println(" использование очереди smallQ для генерации ошибок");
		for (i=0; i<5; i++)
		{
			System.out.println(" Попытка сохранения "+ (char) ('Z'-i));
			smallQ.put((char)('Z'-i));
			ar[i]= smallQ.get();
			System.out.println();
		}


		System.out.println();
		System.out.print(" содержимое smallQ: ");
		for(i=0; i<5; i++)
		{
			/*ch= smallQ.get();
			if(ch!=(char) 0)*/
				System.out.print(ar[i]+"\t");
		}
	}

}
