package by.mf.lin.solutions;

import java.util.Scanner;

public class Branching {
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
		task28();
        task29();
        task30();
        task31();
        task32();
        task33();
        task34();
        task36();
        task37();
        task38();
        task39();
        task40();
		
		
	}

	public static void task01() {
		// 1. ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � �������
		// �� ����� ����� 7, � ��������� ������ � ����� 8.
		int a;
		int b;

		a = 1;
		b = 2;

		if (a < b) {

			System.out.println("������ 1. ����� = [" + 7 + "];");

		} else {

			System.out.println("������ 1. ����� = [" + 8 + "];");

		}

	}

	public static void task02() {
		// ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � ������� ��
		// ����� ����� �yes�, � ��������� ������ � ����� �no�
		int a;
		int b;

		a = 1;
		b = 2;

		if (a < b) {

			System.out.println("������ 2. ����� = [Yes];");

		} else {

			System.out.println("������ 2. ����� = [No];");

		}
	}

	public static void task03() {
		// ��������� ��������� ��������� ���������� ����� � � ����� 3. ������� �� �����
		// ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�.

		int a;

		a = 3;

		if (a < 3) {

			System.out.println("������ 3. ����� = [Yes]");

		} else {

			System.out.println("������ 3. ����� = [No]");

		}

	}

	public static void task04() {
		// ��������� ���������: ����� �� ��� ����� � � b?
		int a;
		int b;

		a = 5;
		b = 4;

		if (a == b) {

			System.out.println("������ 4. ����� [a] ����� [b];");

		} else {

			System.out.println("������ 4. ����� [a] �� ����� [b];");
		}
	}

	public static void task05() {
		// ��������� ���������: ����������� ����������� �� ���� ����� � � b.
		int a;
		int b;

		a = 4;
		b = 5;

		if (a < b) {

			System.out.println("������ 5. ���������� ����� [a];");

		} else if (a > b) {

			System.out.println("������ 5. ���������� ����� [b];");

		} else {

			System.out.println("������ 5. ����� a ����� b;");

		}

	}

	public static void task06() {
		// ��������� ���������: ����������� ����������� �� ���� ����� � � b
		int a;
		int b;

		a = 4;
		b = 5;

		if (a > b) {

			System.out.println("������ 6. ���������� ����� [a];");

		} else if (a < b) {

			System.out.println("������ 6. ���������� ����� [b];");

		} else {

			System.out.println("������ 6. ����� a ����� b;");

		}
	}

	public static void task07() {
		// ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� ��������
		// ��������� a, b, c � �
		double a = 5;
		double b = -3;

		double c = 2;
		double x = -1;

		System.out.println("������ 7. ������ ��������� = [" + (Math.abs(a * Math.pow(x, 2) + (b * x) + c)) + "];");
	}

	public static void task08() {
		// ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b
		double a = 5;
		double b = 4;

		a = a * a;
		b = b * b;

		if (a < b) {
			System.out.println("������ 8. ����������� ������� ����� [a];");
		} else if (a > b) {
			System.out.println("������ 8. ����������� ������� ����� [b];");
		} else {
			System.out.println("������ 8. ������� ����� [a] ����� �������� ����� [b];");
		}

	}

	public static void task09() {
		// ��������� ���������, ������� ��������� �� ���� ��������� ��������, ��������
		// �� ������ ����������� ��������������.
		double a;
		double b;
		double c;

		a = 5;
		b = 5;
		c = 6;

		if (a == b && b == c) {
			System.out.println("������ 9. ����������� �������� ��������������;");
		} else {
			System.out.println("������ 9. ����������� �� �������� ��������������;");
		}
	}

	public static void task10() {
		// ��������� ���������, ������� ��������� ������� ������ ����� ������
		double r1 = 4;
		double r2 = 5;

		double firstSquare;
		double secondSquare;

		firstSquare = Math.PI * Math.pow(r1, 2);
		secondSquare = Math.PI * Math.pow(r2, 2);

		if (firstSquare < secondSquare) {
			System.out.println("������ 10. ������� ����� r1 ������ r2;");
		} else if (firstSquare > secondSquare) {
			System.out.println("������ 10. ������� ����� r2 ������ r1;");
		} else {
			System.out.println("������ 10. ������� ����� r1 ����� r2;");
		}
	}

	public static void task11() {
		double a1 = 5;
		double a2 = 1;

		double h1 = 3;
		double h2 = 4;

		double firstSquare;
		double secondSquare;

		firstSquare = 0.5 * a1 * h1;
		secondSquare = 0.5 * a2 * h2;

		if (firstSquare < secondSquare) {
			System.out.println("������ 11. ������� ������������ �1 ������ �2;");
		} else if (firstSquare > secondSquare) {
			System.out.println("������ 11. ������� ������������ �2 ������ �1;");
		} else {
			System.out.println("������ 11. ������� ������������ �1 ����� �2;");
		}
	}

	public static void task12() {
		// ���� ��� �������������� �����. �������� � ������� �� �� ���, �������� �������
		// ��������������, � � ��������� ������� � �������������.

		double a;
		double b;
		double c;

		a = -5;
		b = -2;
		c = 4;

		if (a > 0 && b > 0 && c > 0) {
			System.out.println(
					"������ 12. ����� = [" + Math.pow(a, 2) + "] [" + Math.pow(b, 2) + "] [" + Math.pow(c, 3) + "]; ");
		} else if (a > 0 && b > 0 && c < 0) {
			System.out.println(
					"������ 12. ����� = [" + Math.pow(a, 2) + "] [" + Math.pow(b, 2) + "] [" + Math.pow(c, 4) + "]; ");
		} else if (a > 0 && b < 0 && c < 0) {
			System.out.println(
					"������ 12. ����� = [" + Math.pow(a, 2) + "] [" + Math.pow(b, 4) + "] [" + Math.pow(c, 4) + "]; ");
		} else if (a < 0 && b > 0 && c > 0) {
			System.out.println(
					"������ 12. ����� = [" + Math.pow(a, 4) + "] [" + Math.pow(b, 2) + "] [" + Math.pow(c, 2) + "]; ");
		} else if (a < 0 && b > 0 && c < 0) {
			System.out.println(
					"������ 12. ����� = [" + Math.pow(a, 4) + "] [" + Math.pow(b, 2) + "] [" + Math.pow(c, 4) + "]; ");
		} else if (a < 0 && b < 0 && c > 0) {
			System.out.println(
					"������ 12. ����� = [" + Math.pow(a, 4) + "] [" + Math.pow(b, 4) + "] [" + Math.pow(c, 2) + "]; ");
		} else {
			System.out.println(
					"������ 12. ����� = [" + Math.pow(a, 4) + "] [" + Math.pow(b, 4) + "] [" + Math.pow(c, 4) + "]; ");
		}
	}

	public static void task13() {
		// ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������,
		// ������� �� ����� ��������� ����� � ������ ���������.
		double x1 = 5;
		double y1 = 6;

		double x2 = 7;
		double y2 = 3;

		double firstDist = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		double secondDist = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		if (firstDist > secondDist) {
			System.out.println("������ 13. ������ ����� ���������� �����;");
		} else {
			System.out.println("������ 13. ������ ����� ���������� �����;");
		}
	}

	public static void task14() {
		// ���� ��� ���� ������������ (� ��������). ����������, ���������� �� �����
		// �����������, � ���� ��, �� ����� �� �� �������������.

		double a = 90;
		double b = 60;

		double sum;

		sum = a + b;

		if (180 - sum == 90) {
			System.out.println("������ 14. ����������� �������������");
		} else if (180 - sum < 0) {
			System.out.println("������ 14. ������ ������������ �� ����������");
		}
	}

	public static void task15() {
		// ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ���� ����
		// ����� �������� ��������� �� �����, � ������� � �� ��������� �������������.
		double x = 5;
		double y = 3;

		double sum = 0;
		double comp = 0;

		if (x < y) {
			sum = x;
			x = (x + y) / 2;
			y = 2 * sum * y;
		} else {
			comp = x;
			x = (x + y) / 2;
			y = 2 * comp * y;
		}
		System.out.println("������ 15. x = [" + x + "]; y = [" + y + "];");

	}

	public static void task16() {
		// �� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ���
		// ����������� (�� ����� ��� ��� � ����� ������������ ����).
		double x = 5;
		double y = -3;

		if ((x > 0) && (y > 0)) {
			System.out.println("������ 16. ����� ��������� � ������ ��������");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("������ 16. ����� ��������� �� ������ ��������");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("������ 16. ����� ��������� � ������� ��������");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("������ 16. ����� ��������� � ��������� ��������");
		} else if ((x == 0) && (y != 0)) {
			System.out.println("������ 16. ����� ��������� �� ��� X");
		} else if ((x != 0) && (y == 0)) {
			System.out.println("������ 16. ����� ��������� �� ��� Y");
		} else {
			System.out.println("������ 16. ����� ��������� � ������ ���������");
		}
	}

	public static void task17() {
		// ���� ����� ����� �, �. ���� ����� �� �����, �� �������� ������ �� ��� ����� �
		// ��� �� ������, ������ ���������� ��������, � ���� �����, �� �������� �����
		// ������.
		int x = 5;
		int y = 3;

		int temp = 0;

		if (x > y) {
			temp = x;
		} else {
			temp = y;
		}

		if (x != y) {
			x = temp;
			y = temp;
		} else {
			x = 0;
			y = 0;
		}

		System.out.println("������ 17. x = [" + x + "]; y = [" + y + "];");
	}

	public static void task18() {
		// ���������� ���������� ������������� ����� ����� �, b, �.
		int a = 5;
		int b = -3;
		int c = -5;

		int count = 0;

		if (a < 0) {
			count = 1;
		}

		if (b < 0) {
			count++;
		}

		if (c < 0) {
			count++;
		}

		System.out.println("������ 18. ������������� ����� = [" + count + "];");
	}

	public static void task19() {
		// ���������� ���������� ������������� ����� ����� �, b, �.
		int a = 5;
		int b = -3;
		int c = -5;

		int count = 0;

		if (a < 0) {
			count = 1;
		}

		if (b < 0) {
			count++;
		}

		if (c < 0) {
			count++;
		}

		System.out.println("������ 19. ������������� ����� = [" + count + "];");
	}

	public static void task20() {
		// ����������, ��������� ����� ����� �, b, � �������� ����� k.
		double a = 3;
		double b = 5;
		double c = 13;

		double k = 3;

		if ((a % k != 0) && (b % k != 0) && (c % k != 0)) {
			System.out.println("������ 20. ����� k �� ��������  ���������� ��� ���� �����");
		} else if (a % k == 0) {
			System.out.println("������ 20. ����� k ��������  ���������� ��� ����� a");
		} else if (b % k == 0) {
			System.out.println("������ 20. ����� k ��������  ���������� ��� ����� b");
		} else if (c % k == 0) {
			System.out.println("������ 20. ����� k ��������  ���������� ��� ����� c");
		}
	}
	public static void task21() {
		//��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� ̻. � ����������� �� ������ �� ������ ������ ��������� �������� �������� �������!� ��� ���� �������� ��������!�.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("������ 22. ��� ��: ������� ��� �������? ����� � ��� �: ");
		
		while (sc.hasNext()) {
			str = sc.next();
			if (str.equals("�")) {
				System.out.println("��� �������� ��������!");
			} else if (str.equals("�")) {
				System.out.println("��� �������� �������!");
			} else {
				System.out.println("�� ��������� ������� ������");
			}
			
		}
	}
	public static void task22() {
		//���������������� �������� ���������� � � � ���, ����� � � ��������� ������� �� ���� ��������, � � y - �������.
    	int x = 4;
    	int y = 3;
    	
    	int temp = 0;
    	
    	if (x < y) {
    		temp = x;
    		x = y;
    		y = temp;
    	}
    	System.out.println("������ 22. x = [" + x + "]; y = [" + y + "];");
	
	}
	/*public static void task23() {
Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("������ 22. ������� ���� ");
		
		while (sc.hasNext()) {
			str = sc.next();
			if (str.equals("�")) {
				System.out.println("��� �������� ��������!");
			} else if (str.equals("�")) {
				System.out.println("��� �������� �������!");
			} else {
				System.out.println("�� ��������� ������� ������");
			}
			
		}
	}*/
	public static void task24() {
		//��������� ���������, ������������ ��������� ������� �� ������� � �������� �����, ���� �� �������� ������ ���������� ��������� �.

		int n = 6;
		if (n % 2 == 0) {
			System.out.println("������ 24. �� �����");
		} else {
			System.out.println("������ 25. �����");
		}
	}
	public static void task25() {
		//�������� ��������� � ������ ������� ��������� ������� � ���������, ������� ������� ��������� �������������� �������� � , ���� ����������� � ������� ��������� 60� �.
		int temp = 30;
		
		if (temp > 60) {
			System.out.println("������ 25. ������������� ��������");
		} else {
			System.out.println("����������� � �����");
		}

	}
	public static void task26() {
		//�������� ��������� ���������� ����� �������� � �������� �� ���� �����
		int a;
		int b;
		int c;
		
		int max;
		int min;

		a = 2;
		b = 3;
		c = 7;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		if (c < min) {
			min = c;
		}		

		System.out.println("������ 26. ����� �������� � �������� = [" + (min + max) + "];");
	}
	public static void task27() {
		//����� max{min(a, b), min(c, d)}.
		
		int a = 5;
		int b = 4;
		
		int c = 3;
		int d = 7;
		
		System.out.println("������ 27. max{min(a, b), min(c, d)} = [" + (Math.max(Math.min(a, b), Math.min(c, d))) + "];");
	}
	public static void task28() {
        //���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� �� ����� d, �� ����� max(d � a, d � b, d �c).
        double a = 5;
        double b = 4;
        double c = 4;

        double d = 3;
        if (a == d) {
            System.out.println("������ 28. ����� a ����� d.");
        } else if (b == d) {
            System.out.println("������ 28. ����� b ����� d.");
        } else if (c == d) {
            System.out.println("������ 28. ����� c ����� d.");
        } else {
            System.out.println("������ 28.  max(d � a, d � b, d �c) = [" + Math.max(Math.max(d - a, d - b), d - c) + "] ");
        }

    }

    public static void task29() {
        //���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������

        double x1 = 5;
        double x2 = 4;
        double x3 = 6;

        double y1 = 5;
        double y2 = 4;
        double y3 = 6;

        double per;

        double firstDist;
        double secondDist;
        double thritDist;


        firstDist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        secondDist = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        thritDist = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        per = (firstDist + secondDist + thritDist) / 2;


        if (Math.sqrt(per * (per - firstDist) * (per - secondDist) * (per - thritDist)) == 0) {
            System.out.println("������ 29. ����� ����� �� ����� ������");
        } else {
            System.out.println("������ 29. ����� �� ����� �� ����� ������");
        }
    }

    public static void task30() {
        //���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �,  � �������� �� ����������� ����������, ���� ��� �� ���.
        double a;
        double b;
        double c;

        a = 4;
        b = 4;
        c = 12;

        if (a > b || b > c) {
            System.out.println("������ 30. ��������� ����� = [" + 2 * a + "] [" + 2 * b + "] [" + 2 * c + "]; ");
        } else {
            System.out.println("������ 30. ���������� �������� = [" + Math.abs(a) + "] [" + Math.abs(b) + "] [" + Math.abs(c) + "];");
        }
    }

    public static void task31() {
        //������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ ����� ���������.
        double x = 5;
        double y = 3;
        double z = 5;

        double a = 10;
        double b = 3;
        if ((x * y < a * b) || (x * z < a * b) || (y * z < a * b)) {
            System.out.println("������ 31. ������ ������� ����� ���������.");
        } else {
            System.out.println("������ 31. ������ �� ������� ����� ���������.");
        }
    }

    public static void task32() {
        //�������� ���������, ������� �� �������� ���� ������ ����������, ������� �� ����� �����-���� ���� �� ��� �������������.
        int a = 5;
        int b = 5;
        int c = -4;

        if (a + b > 0) {
            System.out.println("������ 32. ����� ������ ���� ������������.");
        } else if (b + c > 0) {
            System.out.println("������ 32. ����� ������� � �������� ������������.");
        } else if (a + c > 0) {
            System.out.println("������ 32. ����� ������� � �������� ������������.");
        } else {
            System.out.println("������ 32. ������������� ���� ���.");
        }
    }

    public static void task33() {
        /*�������� ���������, ������� �� ������ ����� ���������� ������� �������
        ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������
        ����� �������,
        �������� �� ��� ������ �� ������� �������.
        ��� ����� ��������� ������: 9583, 1747 � �������� ������ ��� �, �, �;
        3331, 7922 � �������� ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.*/
        Scanner sc = new Scanner(System.in);
        double pass = 0;

        System.out.print("������ 33. ������� ������: ");

            pass = sc.nextInt();
            if ((pass == 9583) || (pass == 1747)) {
                System.out.println("� ��� �������� ������ ��� �, �, �");
            } else if ((pass == 3331) || (pass == 7922)) {
                System.out.println("� ��� �������� ������ ��� �, �");
            } else if ((pass == 9455) || (pass == 8997)) {
                System.out.println("� ��� �������� ������ ���� �");
            } else {
                System.out.println("� ��� ��� ������� � ������� ����");
            }

    }

    public static void task34() {
        /* 34. ��������� ���������, ����������� ������ ���������� ���������� � �������
        ��������.
        ��������� ����������� ��������� ����, ����� �����, ��������� �����������;
        ���� ����� �� ���������,
        �������� �� ������ ��������; ���� ����� ������� ������, ��� ����������, ��
        �������� ��������� �����
        � ��������� ����� �����; ���� ����� ������������, �� �������� ��������� ��
        ����
        � ��������� ������ ����������� �����*/


        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;
        System.out.println("������ 34. ������� ��������� ����� ");
           x = sc.nextInt();
           System.out.print("������� ����� ���������� ");
            y = sc.nextInt();
            if ( x == y){
                System.out.println("�������");
            } else if (y - x > 0) {
                System.out.println("�������� ����� + [" + (y - x) + "]");
            } else System.out.println("������������ �����, ����� ��������� + [" + (x - y) + "]");




    }
   /* public static void task35(){
        //��������� ����� � ����� � ������������ ���� �� ������ ���.
        Scanner sc = new Scanner(System.in);
        int day;
        int num;

        boolean bl;

        bl = true;

        System.out.println("������� ����:");
        day = sc.nextInt();
        switch (day){
            case ( day > 0 && day <= 31):
                num = day - 31;
                System.out.println("35) ������ " + num + " �����");
                break;
        }
    }*/
    public static void task36(){
        //��������� �������� �������
        double x = 5;

        double fun;

        if (x <= 3) {
            fun = x * x - 3 * x + 9;
        } else {
            fun = 1 / (x * x * x + 6);
        }
        System.out.println("������ 36. �������� ������� = [" + fun + "];");
    }
    public static void task37(){
       //��������� �������� �������
        double x = 5;

        double fun;

        if (x >= 3) {
            fun = -x * x + 3 * x + 9;
        } else {
            fun = 1 / (x * x * x - 6);
        }
        System.out.println("������ 36. �������� ������� = [" + fun + "];");
    }

    public static void task38(){
       //��������� �������� �������
        double x = 5;

        double fun;

        if ((x <= 3) && (x >= 0)) {
            fun = x * x;
        } else {
            fun = 4;
        }
        System.out.println("������ 36. �������� ������� = [" + fun + "];");
    }
    public static void task39(){
       //��������� �������� �������
        double x = 5;

        double fun;

        if (x >= 8) {
            fun = -x * x + x - 9;
        } else {
            fun = 1 / (Math.pow(x, 4) - 6);
        }
        System.out.println("������ 36. �������� ������� = [" + fun + "];");
    }
    public static void task40(){
        //��������� �������� �������
        double x = 5;

        double fun;

        if (x <= 13) {
            fun = -x * x * x + 9;
        } else {
            fun = -3 / (x + 1);
        }
        System.out.println("������ 36. �������� ������� = [" + fun + "];");
    }

}
