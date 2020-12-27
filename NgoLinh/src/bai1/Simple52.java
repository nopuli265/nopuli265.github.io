package bai1;

public class Simple52 {

	public static void main(String[] args) 
	// TODO Auto-generated method stub
			throws java.io.IOException {
		char ch;
		for( ; ; )
		{			
			System.out.println("выбирите: ");
			ch = (char) System.in.read();
			if (ch=='q') break;
		}
		System.out.println("Вы нажали q! ");

	}

}


