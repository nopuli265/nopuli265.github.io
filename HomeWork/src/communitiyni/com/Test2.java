package communitiyni.com;

	
	import java.util.Scanner;

	public class Test2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			while(true)
			{
				System.out.println("планеты в солнечной системе:");
				System.out.println("1. меркурий ");
				System.out.println("2. венера ");
				System.out.println("3. земля ");
				System.out.println("4. марс ");
				System.out.println("5. юпитер ");
				System.out.println("6. сатурн ");
				System.out.println("7. уран");
				System.out.println("8. непту");
				System.out.println("9. плуто");
				System.out.println("Выбирите один из пунктов ");
				System.out.println("\n");
				Scanner sc= new Scanner(System.in);
				System.out.print("введите свой вес m= ");
				float m = sc.nextFloat();
				System.out.print("введите имя планеты : ");
				String line = new Scanner(System.in).nextLine();

				switch (line)
				{
				case "меркурий" :
					System.out.println("F = "+m+ " * 3.7 = "+(m*3.7));
					break;
				case "венера" :
					System.out.println("F = "+m+ " * 8.87 = "+(m*8.87));
					break;
				case "земля" :
					System.out.println("F = "+m+ " * 9.8 = "+(m*9.8));
					break;
				case "марс" :
					System.out.println("F = "+m+ " * 3.7 = "+(m*3.7));
					break;
				case "юпитер" :
					System.out.println("F = "+m+ " * 24.75 = "+(m*24.75));
					break;
				case "сатурн" :
					System.out.println("F = "+m+ " * 10.445 = "+(m*10.445));
					break;
				case "уран" :
					System.out.println("F = "+m+ " * 8.87 = "+(m*8.87));
					break;
				case "непту" :
					System.out.println("F = "+m+ " * 11.15 = "+(m*11.15));
					break;
				case "плуто" :
					System.out.println("F = "+m+ " *0.61 = "+(m*0.61));
					break;
				default:
					System.err.println("Эта планета не в солнечной системе!");
					System.out.println("\n");
					break;
				}
				System.out.println("Вы хотите продолжить?(да/нет)?");
				
				String line1= new Scanner(System.in).nextLine();
				while(line1.equalsIgnoreCase("да"))
				{
				if(line1.equalsIgnoreCase("нет"))
				
				break;
				}
				System.out.println("Спасибо за использование программы!");
				System.out.println("goodbye!");
			}
		}

	}


