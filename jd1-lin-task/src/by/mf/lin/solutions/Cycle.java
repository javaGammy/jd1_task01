package by.mf.lin.solutions;

public class Cycle {

	public static void getInfo() {
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37();
		task38();
		task39();
		task40();
		
	}

	public static void task01() {
		// Необходимо вывести на экран числа от 1 до 5.
		System.out.print("Задача 1. ");
		for (int i = 1; i <= 5; i++) {
			System.out.print("[" + i + "] ");
		}

	}

	public static void task02() {
		// Необходимо вывести на экран числа от 5 до 1.
		System.out.print("\nЗадача 2. ");
		for (int i = 5; i >= 1; i--) {
			System.out.print("[" + i + "] ");
		}
	}

	public static void task03() {
		// Необходимо вывести на экран таблицу умножения на 3:
		System.out.print("\nЗадача 3. ");
		for (int i = 1; i <= 10; i++) {
			System.out.print("[" + (i * 3) + "] ");
		}
	}

	public static void task04() {
		// С помощью оператора while напишите программу вывода всех четных чисел в
		// диапазоне от 2 до 100 включительно.
		System.out.print("\nЗадача 3. ");
		int n = 2;
		while (n <= 100) {
			if (n % 2 == 0) {
				System.out.print(" [" + n + "] ");
			}
			n++;
		}
	}

	public static void task05() {
		// С помощью оператора while напишите программу определения суммы всех нечетных
		// чисел в диапазоне от 1 до 99 включительно.
		System.out.print("\nЗадача 4. ");
		int sum = 0;
		int n = 1;
		while (n <= 99) {
			if (n % 2 != 0) {
				sum += n;
			}
			n++;
		}
		System.out.print(" [" + sum + "] ");
	}

	public static void task06() {
		// Напишите программу, где пользователь вводит любое целое положительное число.
		// А программа суммирует все числа от 1 до введенного пользователем числа
		System.out.print("\nЗадача 5. ");
		int sum = 0;
		int n = 4;
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		System.out.println("[" + sum + "]");
	}

}
