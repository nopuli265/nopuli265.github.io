package communityuni.com;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example bigQ= new Example(100);
Example smallQ= new Example(4);
Example test= new Example(10);
char ch; int i;
test.q[0]=99;
test.putloc=-100;
System.out.println("использование очереди bigQ для сохранения алфавита ");
for (i=0;i<26;i++)
bigQ.put((char)('A'+i));
System.out.print("содержимое очереди bigQ: ");
for(i=0; i<26;i++)
{
	ch=bigQ.get();
	if(ch!=(char)0)
		System.out.print(ch+"\t");
}
System.out.println("\n");
System.out.println(" использование очереди smallQ для генерации ошибок");
for (i=0; i<5; i++)
{
	System.out.println(" Попытка сохранения "+ (char) ('Z'-i));
	smallQ.put((char)('Z'-i));
	System.out.println();
}


System.out.println();
System.out.print(" содержимое smallQ: ");
for(i=0; i<5; i++)
{
	ch= smallQ.get();
	if(ch!=(char) 0)
		System.out.print(ch+"\t");
}}

}
