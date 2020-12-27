package bai1;

public class Simple321 {

	public static void main(String[] args) 
					throws java.io.IOException {
						char ch, ans = '6';
						System.out.println("Я загадал латинскую букву от 1 до 10.");
						System.out.println("Попробуй угадать: ");
						ch = (char) System.in.read();
						if(ch == ans) System.out.println("Ты угадал!!!");
						else { System.out.println("Извини, ты ошибся ");
						if (ch<ans)System.out.println("Рано");
						else System.out.println("Поздно");
						}
						

	}

}
