package bai1;

import java.io.InputStream;
import java.util.Scanner;

public class Simple372 {
	public static void main (String args[]) {
		System.out.println("управление склад: ");
		System.out.println("Справочник: ");
		System.out.println("1. процедура клиент ");
		System.out.println("2. процедура поставщика ");
		System.out.println("4. процедура Склад ");
		System.out.println("5. процедура Кладовщик ");
		System.out.println("6. процедура Транспорт ");
		System.out.println("7. процедура Сотрудник ");
		System.out.println("8. процедура Счет фактуры импорт товаров ");
		System.out.println("9. процедура Счет фактуры экспорт товаров ");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Выбирите один из пунктов ");
		int	ch = sc.nextInt();
		System.out.println("\n");
		switch (ch) {
		case 1:
			System.out.println("1. ввод:id клиент,имя_клиента ,телефон,адрес;");
			System.out.println(" если потверждено то {сохранить в БД  Клиенты;} иначе: выход;");
			System.out.println("конец процедуры ");
			break;
		case 2:
			System.out.println("2.ввод:id поставщика,имя_поставщика ,телефон,адрес; ");
			System.out.println("если потверждено то {сохранить в БД  Поставщика;}  иначе: выход");
			System.out.println("конец процедуры ");
			break;
		case 3 :
			System.out.println("3. id склад,имя_товаров,имя склад, адрес склад ,количество, id экспортный склад, id импортный склад, id персонал , id поставщик, id клиент ");
			System.out.println("если потверждено то {сохранить в БД  Склад} иначе выход;");
			System.out.println("конец процедуры ");
			break;
		case 4:
			System.out.println("4.ввод:id,имя кладовщик, должность; ");
			System.out.println("потверждено то {сохранить в БД  Кладовщик;} иначе: выход");
			System.out.println("конец процедуры ");
			break;
		case 5:
			System.out.println("5.ввод:id,имя Транспорт, должность; ");
			System.out.println("если потверждено то {сохранить в БД  Транспорт;}  иначе: выход");
			System.out.println("конец процедуры ");
			break;
		case 6:
			System.out.println("6.ввод:id,имя Сотрудник, должность;");
			System.out.println("если потверждено то {сохранить в БД  Поставщика;}  иначе: выход");
			System.out.println("конец процедуры ");
			break;
		case 7:
			System.out.println("7.ввод:id поставщика,имя_поставщика ,телефон,адрес; ");
			System.out.println("если     потверждено то {сохранить в БД  Сотрудник;} иначе: выход");
			System.out.println("конец процедуры ");
			break;
		case 8:
			System.out.println("8.ввод:id, название товаров , количество, уена, сумма, id  поставщика; ");
			System.out.println("если потверждено то {сохранить в БД  Счет фактуры импорт товаров;} иначе: выход");
			System.out.println("конец процедуры ");
			break;
		case 9:
			System.out.println("9.ввод:id, название товаров , количество, уена, сумма, id  клиента;");
			System.out.println("если    потверждено то {сохранить в БД Счет фактуры импорт товаров;} иначе: выход");
			System.out.println("конец процедуры ");
			break;
		default:
			System.out.println("Номер не найден");
		}
	}
}



