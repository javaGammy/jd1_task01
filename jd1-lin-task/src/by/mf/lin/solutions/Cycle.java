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
		// ���������� ������� �� ����� ����� �� 1 �� 5.
		System.out.print("������ 1. ");
		for (int i = 1; i <= 5; i++) {
			System.out.print("[" + i + "] ");
		}

	}

	public static void task02() {
		// ���������� ������� �� ����� ����� �� 5 �� 1.
		System.out.print("\n������ 2. ");
		for (int i = 5; i >= 1; i--) {
			System.out.print("[" + i + "] ");
		}
	}

	public static void task03() {
		// ���������� ������� �� ����� ������� ��������� �� 3:
		System.out.print("\n������ 3. ");
		for (int i = 1; i <= 10; i++) {
			System.out.print("[" + (i * 3) + "] ");
		}
	}

	public static void task04() {
		// � ������� ��������� while �������� ��������� ������ ���� ������ ����� �
		// ��������� �� 2 �� 100 ������������.
		System.out.print("\n������ 3. ");
		int n = 2;
		while (n <= 100) {
			if (n % 2 == 0) {
				System.out.print(" [" + n + "] ");
			}
			n++;
		}
	}

	public static void task05() {
		// � ������� ��������� while �������� ��������� ����������� ����� ���� ��������
		// ����� � ��������� �� 1 �� 99 ������������.
		System.out.print("\n������ 4. ");
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
		// �������� ���������, ��� ������������ ������ ����� ����� ������������� �����.
		// � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����
		System.out.print("\n������ 5. ");
		int sum = 0;
		int n = 4;
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		System.out.println("[" + sum + "]");
	}

}
