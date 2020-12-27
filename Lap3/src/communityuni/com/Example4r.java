package communityuni.com;

public class Example4r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example4 q1= new Example4(10);
char name[]= {'T','o','m'};
Example4 q2= new Example4(name);
char ch;
int i;
for ( i=0; i<10; i++)
	q1.put((char)('A'+i));
Example4 q3= new Example4(q1);
System.out.print(" содержимое q1: ");
for (i=0;i<10;i++)
{
	ch=q1.get();
System.out.print(ch+"\t");
	}
	
System.out.println("\n");
System.out.print(" содержимое q2: ");
for (i=0;i<3;i++)
{
	ch=q2.get();
System.out.print(ch+"\t");
	}
	
System.out.println("\n");
System.out.print(" содержимое q3: ");
for (i=0;i<10;i++)
{
	ch=q3.get();
System.out.print(ch+"\t");
	}
	}}
