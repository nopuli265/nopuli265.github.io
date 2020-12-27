package bai1;

public class Simple49 {

	public static void main(String[] args) 
	// TODO Auto-generated method stub
			throws java.io.IOException{
		char ch, ig, ans = 'S';
		do {
			System.out.println("я загадал букву от A до Z");
			System.out.println("Попробуй угадать");
			ch= (char) System.in.read();
			do {
				ig =(char) System.in.read();
			}
			while(ig!='\n');
			if (ch==ans)
				System.out.println("ты угадал!");
			else
			{
				System.out.println("сожалею, ты ошибся");
				if (ch< ans)
					System.out.println("Слишком рано");
				else
					System.out.println("слишком поздно");
				System.out.println("попробуй еще разок:");

			}
		}while(ch !=ans);
	}

}
