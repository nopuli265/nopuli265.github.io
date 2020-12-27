package communityuni.com;

public class Simple100 {
	public static void main(String args[]) {
		String ms = "Это пробная версия шифровальщика";
		String enms = "";
		String dems = "";
		int key = 88;
		System.out.print("Первоначальное сообщение: ");
		System.out.println(ms);
		for(int i=0; i<ms.length(); i++)
			enms=enms + (char) (ms.charAt(i)^key);
		System.out.print("Зашифрованное сообщение: ");
		System.out.println(enms);
		for (int i=0; i<ms.length(); i++)
			dems = dems + (char) (enms.charAt(i)^key);
		System.out.print("Расшифрованное сообщение: ");
		System.out.println(dems);
		}
}

