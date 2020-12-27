package bai1;

public class Simple48 {

	public static void main(String[] args) 
	throws java.io.IOException
	{
		char ch;
		do {
			System.out.println("нажмите клавишу, а затем ENTER:");
			ch= (char) System.in.read();
		}while(ch!='q');
	}

}
