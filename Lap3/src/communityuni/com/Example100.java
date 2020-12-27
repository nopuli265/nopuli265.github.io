package communityuni.com;

import java.util.Scanner;

public class Example100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Запись строки должна быть закодирована");
		String ms = new Scanner(System.in).nextLine();
		String enms = "";
		String dems = "";
		String key;
	
		System.out.println("вводите key с клавиатуры(строка из восьми символов): ");
		key = new Scanner(System.in).nextLine();
		System.out.print("Первоначальное сообщение: ");
		System.out.println(ms);
		
		for(int i=0; i<ms.length(); i++)
			enms=enms + (char) (ms.charAt(i)^key.charAt(i%key.length()));
		System.out.print("Зашифрованное сообщение: ");
		System.out.println(enms);
		
			for (int i=0; i<ms.length(); i++)
			dems = dems + (char) (enms.charAt(i)^key.charAt(i%key.length()));
		System.out.print("Расшифрованное сообщение: ");
		System.out.println(dems);
		
		}
		

	

}
