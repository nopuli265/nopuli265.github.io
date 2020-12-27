package bai1;

public class Simple84r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Simple84 bD= new Simple84(100);
Simple84 sD= new Simple84(4);
char h;
int i;
System.out.println(" используйте большую очередь bD для хранения алфавита.");
for (i=0; i<26; i++)
{
	bD.put((char)('A'+i));
	System.out.print(" содержание большую очередь  bD :");
	for (i=0;i<26; i++)
	{
		h=bD.get();
		if (h!=(char)0) System.out.print(h);
	}
	System.out.println("\n");
	System.out.println("используйте маленькой очередь sD для генерации ошибок");
	for (i=0; i<5; i++)
	{
		System.out.print(" пробуем сохранить"+ (char)('Z'-i));
		sD.put((char)('Z'-i));
		System.out.println();
		
	}
	System.out.println();
	System.out.print("содержание маленькой очереди sD:");
	for (i=0; i<5; i++)
	{
		h=sD.get();
		if(h!=(char)0)
			System.out.print(h);
	}
}
	}

}
