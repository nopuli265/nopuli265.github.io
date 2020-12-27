package bai1;

public class Simple37 {

	public static void main (String args[])
			throws java.io.IOException {
			char ch;
			System.out.println("Справочник: ");
			System.out.println("1. оператор if ");
			System.out.println("2. оператор switch ");
			System.out.println("3. оператор for ");
			System.out.println("Выбирите один из пунктов ");
			ch = (char) System.in.read();
			System.out.println("\n");
			switch (ch) {
				case '1':
					System.out.println("1. оператор if это оператор условия ");
					System.out.println("стандартная форма if(условие){ оператор} ");
					System.out.println("else оператор ");
					break;
				case '2':
					System.out.println("2. оператор switch это оператор условия ");
					System.out.println("стандартная форма switch (переменная){ case ");
					System.out.println("break; ");
					break;
				case '3' :
					System.out.println("3. оператор for это оператор цикла ");
					System.out.println("стандартная форма for(нициализация; условие; итерация) ");
					System.out.println("оператор ");
					break;
				default:
					System.out.println("Номер не найден");
			}
			}

	}


