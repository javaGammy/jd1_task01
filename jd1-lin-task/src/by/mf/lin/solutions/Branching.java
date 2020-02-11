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
		// 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		// на экран цифру 7, в противном случае – цифру 8.
		int a;
		int b;

		a = 1;
		b = 2;

		if (a < b) {

			System.out.println("Задача 1. Ответ = [" + 7 + "];");

		} else {

			System.out.println("Задача 1. Ответ = [" + 8 + "];");

		}

	}

	public static void task02() {
		// Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на
		// экран слово «yes», в противном случае – слово «no»
		int a;
		int b;

		a = 1;
		b = 2;

		if (a < b) {

			System.out.println("Задача 2. Ответ = [Yes];");

		} else {

			System.out.println("Задача 2. Ответ = [No];");

		}
	}

	public static void task03() {
		// Составить программу сравнения введенного числа а и цифры 3. Вывести на экран
		// слово «yes», если число а меньше 3; если больше, то вывести слово «no».

		int a;

		a = 3;

		if (a < 3) {

			System.out.println("Задача 3. Ответ = [Yes]");

		} else {

			System.out.println("Задача 3. Ответ = [No]");

		}

	}

	public static void task04() {
		// Составить программу: равны ли два числа а и b?
		int a;
		int b;

		a = 5;
		b = 4;

		if (a == b) {

			System.out.println("Задача 4. Число [a] равно [b];");

		} else {

			System.out.println("Задача 4. Число [a] не равно [b];");
		}
	}

	public static void task05() {
		// Составить программу: определения наименьшего из двух чисел а и b.
		int a;
		int b;

		a = 4;
		b = 5;

		if (a < b) {

			System.out.println("Задача 5. Наименьшее число [a];");

		} else if (a > b) {

			System.out.println("Задача 5. Наименьшее число [b];");

		} else {

			System.out.println("Задача 5. Число a равно b;");

		}

	}

	public static void task06() {
		// Составить программу: определения наибольшего из двух чисел а и b
		int a;
		int b;

		a = 4;
		b = 5;

		if (a > b) {

			System.out.println("Задача 6. Наибольшее число [a];");

		} else if (a < b) {

			System.out.println("Задача 6. Наибольшее число [b];");

		} else {

			System.out.println("Задача 6. Число a равно b;");

		}
	}

	public static void task07() {
		// Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
		// значениях a, b, c и х
		double a = 5;
		double b = -3;

		double c = 2;
		double x = -1;

		System.out.println("Задача 7. Модуль выражения = [" + (Math.abs(a * Math.pow(x, 2) + (b * x) + c)) + "];");
	}

	public static void task08() {
		// Составить программу нахождения наименьшего из квадратов двух чисел а и b
		double a = 5;
		double b = 4;

		a = a * a;
		b = b * b;

		if (a < b) {
			System.out.println("Задача 8. Найименьший квадрат числа [a];");
		} else if (a > b) {
			System.out.println("Задача 8. Найименьший квадрат числа [b];");
		} else {
			System.out.println("Задача 8. Квадрат числа [a] равен квадрату числа [b];");
		}

	}

	public static void task09() {
		// Составить программу, которая определит по трем введенным сторонам, является
		// ли данный треугольник равносторонним.
		double a;
		double b;
		double c;

		a = 5;
		b = 5;
		c = 6;

		if (a == b && b == c) {
			System.out.println("Задача 9. Треугольник является равносторенним;");
		} else {
			System.out.println("Задача 9. Треугольник не является равносторенним;");
		}
	}

	public static void task10() {
		// Составить программу, которая определит площадь какого круга меньше
		double r1 = 4;
		double r2 = 5;

		double firstSquare;
		double secondSquare;

		firstSquare = Math.PI * Math.pow(r1, 2);
		secondSquare = Math.PI * Math.pow(r2, 2);

		if (firstSquare < secondSquare) {
			System.out.println("Задача 10. Площадь круга r1 меньше r2;");
		} else if (firstSquare > secondSquare) {
			System.out.println("Задача 10. Площадь круга r2 меньше r1;");
		} else {
			System.out.println("Задача 10. Площадь круга r1 равна r2;");
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
			System.out.println("Задача 11. Площадь треугольника а1 меньше а2;");
		} else if (firstSquare > secondSquare) {
			System.out.println("Задача 11. Площадь треугольника а2 меньше а1;");
		} else {
			System.out.println("Задача 11. Площадь треугольника а1 равна а2;");
		}
	}

	public static void task12() {
		// Даны три действительных числа. Возвести в квадрат те из них, значения которых
		// неотрицательны, и в четвертую степень — отрицательные.

		double a;
		double b;
		double c;

		a = -5;
		b = -2;
		c = 4;

		if (a > 0 && b > 0 && c > 0) {
			System.out.println(
					"Задача 12. Ответ = [" + Math.pow(a, 2) + "] [" + Math.pow(b, 2) + "] [" + Math.pow(c, 3) + "]; ");
		} else if (a > 0 && b > 0 && c < 0) {
			System.out.println(
					"Задача 12. Ответ = [" + Math.pow(a, 2) + "] [" + Math.pow(b, 2) + "] [" + Math.pow(c, 4) + "]; ");
		} else if (a > 0 && b < 0 && c < 0) {
			System.out.println(
					"Задача 12. Ответ = [" + Math.pow(a, 2) + "] [" + Math.pow(b, 4) + "] [" + Math.pow(c, 4) + "]; ");
		} else if (a < 0 && b > 0 && c > 0) {
			System.out.println(
					"Задача 12. Ответ = [" + Math.pow(a, 4) + "] [" + Math.pow(b, 2) + "] [" + Math.pow(c, 2) + "]; ");
		} else if (a < 0 && b > 0 && c < 0) {
			System.out.println(
					"Задача 12. Ответ = [" + Math.pow(a, 4) + "] [" + Math.pow(b, 2) + "] [" + Math.pow(c, 4) + "]; ");
		} else if (a < 0 && b < 0 && c > 0) {
			System.out.println(
					"Задача 12. Ответ = [" + Math.pow(a, 4) + "] [" + Math.pow(b, 4) + "] [" + Math.pow(c, 2) + "]; ");
		} else {
			System.out.println(
					"Задача 12. Ответ = [" + Math.pow(a, 4) + "] [" + Math.pow(b, 4) + "] [" + Math.pow(c, 4) + "]; ");
		}
	}

	public static void task13() {
		// Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		// которая из точек находится ближе к началу координат.
		double x1 = 5;
		double y1 = 6;

		double x2 = 7;
		double y2 = 3;

		double firstDist = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		double secondDist = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		if (firstDist > secondDist) {
			System.out.println("Задача 13. Первая точка находиться ближе;");
		} else {
			System.out.println("Задача 13. Вторая точка находиться ближе;");
		}
	}

	public static void task14() {
		// Даны два угла треугольника (в градусах). Определить, существует ли такой
		// треугольник, и если да, то будет ли он прямоугольным.

		double a = 90;
		double b = 60;

		double sum;

		sum = a + b;

		if (180 - sum == 90) {
			System.out.println("Задача 14. Треугольник прямоугольный");
		} else if (180 - sum < 0) {
			System.out.println("Задача 14. Такого треугольника не существует");
		}
	}

	public static void task15() {
		// Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
		// чисел заменить половиной их суммы, а большее — их удвоенным произведением.
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
		System.out.println("Задача 15. x = [" + x + "]; y = [" + y + "];");

	}

	public static void task16() {
		// На плоскости ХОY задана своими координатами точка А. Указать, где она
		// расположена (на какой оси или в каком координатном угле).
		double x = 5;
		double y = -3;

		if ((x > 0) && (y > 0)) {
			System.out.println("Задача 16. Точка находится в первой четверти");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("Задача 16. Точка находится во второй четверти");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("Задача 16. Точка находится в третьей четверти");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("Задача 16. Точка находится в четвертой четверти");
		} else if ((x == 0) && (y != 0)) {
			System.out.println("Задача 16. Точка находится на оси X");
		} else if ((x != 0) && (y == 0)) {
			System.out.println("Задача 16. Точка находится на оси Y");
		} else {
			System.out.println("Задача 16. Точка находится в начале координат");
		}
	}

	public static void task17() {
		// Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и
		// тем же числом, равным большемуиз исходных, а если равны, то заменить числа
		// нулями.
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

		System.out.println("Задача 17. x = [" + x + "]; y = [" + y + "];");
	}

	public static void task18() {
		// Подсчитать количество отрицательных среди чисел а, b, с.
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

		System.out.println("Задача 18. Отрицательных чисел = [" + count + "];");
	}

	public static void task19() {
		// Подсчитать количество положительных среди чисел а, b, с.
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

		System.out.println("Задача 19. Положительных чисел = [" + count + "];");
	}

	public static void task20() {
		// Определить, делителем каких чисел а, b, с является число k.
		double a = 3;
		double b = 5;
		double c = 13;

		double k = 3;

		if ((a % k != 0) && (b % k != 0) && (c % k != 0)) {
			System.out.println("Задача 20. Число k не является  множетелем для этих чисел");
		} else if (a % k == 0) {
			System.out.println("Задача 20. Число k является  множетелем для числа a");
		} else if (b % k == 0) {
			System.out.println("Задача 20. Число k является  множетелем для числа b");
		} else if (c % k == 0) {
			System.out.println("Задача 20. Число k является  множетелем для числа c");
		}
	}
	public static void task21() {
		//Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В зависимости от ответа на экране должен появиться текст«Мне нравятся девочки!» или «Мне нравятся мальчики!».
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("Задача 22. Кто ты: мальчик или девочка? Введи Д или М: ");
		
		while (sc.hasNext()) {
			str = sc.next();
			if (str.equals("Д")) {
				System.out.println("Мне нравятся мальчики!");
			} else if (str.equals("М")) {
				System.out.println("Мне нравятся девочки!");
			} else {
				System.out.println("Не корректно введены данные");
			}
			
		}
	}
	public static void task22() {
		//Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
    	int x = 4;
    	int y = 3;
    	
    	int temp = 0;
    	
    	if (x < y) {
    		temp = x;
    		x = y;
    		y = temp;
    	}
    	System.out.println("Задача 22. x = [" + x + "]; y = [" + y + "];");
	
	}
	/*public static void task23() {
Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Задача 22. Введите дату ");
		
		while (sc.hasNext()) {
			str = sc.next();
			if (str.equals("Д")) {
				System.out.println("Мне нравятся мальчики!");
			} else if (str.equals("М")) {
				System.out.println("Мне нравятся девочки!");
			} else {
				System.out.println("Не корректно введены данные");
			}
			
		}
	}*/
	public static void task24() {
		//Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п.

		int n = 6;
		if (n % 2 == 0) {
			System.out.println("Задача 24. Не любит");
		} else {
			System.out.println("Задача 25. Любит");
		}
	}
	public static void task25() {
		//Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация » , если температура в комнате превысила 60° С.
		int temp = 30;
		
		if (temp > 60) {
			System.out.println("Задача 25. Пожароопасная ситуация");
		} else {
			System.out.println("Температура в норме");
		}

	}
	public static void task26() {
		//Написать программу нахождения суммы большего и меньшего из трех чисел
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

		System.out.println("Задача 26. Сумма большего и меньшего = [" + (min + max) + "];");
	}
	public static void task27() {
		//Найти max{min(a, b), min(c, d)}.
		
		int a = 5;
		int b = 4;
		
		int c = 3;
		int d = 7;
		
		System.out.println("Задача 27. max{min(a, b), min(c, d)} = [" + (Math.max(Math.min(a, b), Math.min(c, d))) + "];");
	}
	public static void task28() {
        //Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).
        double a = 5;
        double b = 4;
        double c = 4;

        double d = 3;
        if (a == d) {
            System.out.println("Задача 28. число a равно d.");
        } else if (b == d) {
            System.out.println("Задача 28. число b равно d.");
        } else if (c == d) {
            System.out.println("Задача 28. число c равно d.");
        } else {
            System.out.println("Задача 28.  max(d — a, d — b, d —c) = [" + Math.max(Math.max(d - a, d - b), d - c) + "] ");
        }

    }

    public static void task29() {
        //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой

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
            System.out.println("Задача 29. Точки лежат на одной прямой");
        } else {
            System.out.println("Задача 29. Точки не лежат на одной прямой");
        }
    }

    public static void task30() {
        //Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с,  и заменить их абсолютными значениями, если это не так.
        double a;
        double b;
        double c;

        a = 4;
        b = 4;
        c = 12;

        if (a > b || b > c) {
            System.out.println("Задача 30. Удвоенные числа = [" + 2 * a + "] [" + 2 * b + "] [" + 2 * c + "]; ");
        } else {
            System.out.println("Задача 30. Абсолютное значение = [" + Math.abs(a) + "] [" + Math.abs(b) + "] [" + Math.abs(c) + "];");
        }
    }

    public static void task31() {
        //Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
        double x = 5;
        double y = 3;
        double z = 5;

        double a = 10;
        double b = 3;
        if ((x * y < a * b) || (x * z < a * b) || (y * z < a * b)) {
            System.out.println("Задача 31. Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Задача 31. Кирпич не пройдет через отверстие.");
        }
    }

    public static void task32() {
        //Написать программу, которая по заданным трем числам определяет, вляется ли сумма каких-либо двух из них положительной.
        int a = 5;
        int b = 5;
        int c = -4;

        if (a + b > 0) {
            System.out.println("Задача 32. Сумма первых двух положительна.");
        } else if (b + c > 0) {
            System.out.println("Задача 32. Сумма второго и третьего положительна.");
        } else if (a + c > 0) {
            System.out.println("Задача 32. Сумма первого и третьего положительна.");
        } else {
            System.out.println("Задача 32. Положительных сумм нет.");
        }
    }

    public static void task33() {
        /*Написать программу, которая по паролю будет определять уровень доступа
        сотрудника к секретной информации в базе данных. Доступ к базе имеют только
        шесть человек,
        разбитых на три группы по степени доступа.
        Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С;
        3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.*/
        Scanner sc = new Scanner(System.in);
        double pass = 0;

        System.out.print("Задача 33. Введите пароль: ");

            pass = sc.nextInt();
            if ((pass == 9583) || (pass == 1747)) {
                System.out.println("У вас доступны модули баз А, В, С");
            } else if ((pass == 3331) || (pass == 7922)) {
                System.out.println("У вас доступны модули баз В, С");
            } else if ((pass == 9455) || (pass == 8997)) {
                System.out.println("У вас доступны модули базы С");
            } else {
                System.out.println("У вас нет доступа к модулям база");
            }

    }

    public static void task34() {
        /* 34. Составить программу, реализующую эпизод применения компьютера в книжном
        магазине.
        Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
        если сдачи не требуется,
        печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то
        печатает «возьмите сдачу»
        и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об
        этом
        и указывает размер недостающей суммы*/


        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;
        System.out.println("Задача 34. Введите стоимость книги ");
           x = sc.nextInt();
           System.out.print("Введите сумму покупателя ");
            y = sc.nextInt();
            if ( x == y){
                System.out.println("Спасибо");
            } else if (y - x > 0) {
                System.out.println("Возьмите сдачу + [" + (y - x) + "]");
            } else System.out.println("Недостаточно денег, нужно доплатить + [" + (x - y) + "]");




    }
   /* public static void task35(){
        //Вычислить число и месяц в невисокосном году по номеру дня.
        Scanner sc = new Scanner(System.in);
        int day;
        int num;

        boolean bl;

        bl = true;

        System.out.println("Введите день:");
        day = sc.nextInt();
        switch (day){
            case ( day > 0 && day <= 31):
                num = day - 31;
                System.out.println("35) Январь " + num + " число");
                break;
        }
    }*/
    public static void task36(){
        //Вычислить значение функции
        double x = 5;

        double fun;

        if (x <= 3) {
            fun = x * x - 3 * x + 9;
        } else {
            fun = 1 / (x * x * x + 6);
        }
        System.out.println("Задача 36. Значение функции = [" + fun + "];");
    }
    public static void task37(){
       //Вычислить значение функции
        double x = 5;

        double fun;

        if (x >= 3) {
            fun = -x * x + 3 * x + 9;
        } else {
            fun = 1 / (x * x * x - 6);
        }
        System.out.println("Задача 36. Значение функции = [" + fun + "];");
    }

    public static void task38(){
       //Вычислить значение функции
        double x = 5;

        double fun;

        if ((x <= 3) && (x >= 0)) {
            fun = x * x;
        } else {
            fun = 4;
        }
        System.out.println("Задача 36. Значение функции = [" + fun + "];");
    }
    public static void task39(){
       //Вычислить значение функции
        double x = 5;

        double fun;

        if (x >= 8) {
            fun = -x * x + x - 9;
        } else {
            fun = 1 / (Math.pow(x, 4) - 6);
        }
        System.out.println("Задача 36. Значение функции = [" + fun + "];");
    }
    public static void task40(){
        //Вычислить значение функции
        double x = 5;

        double fun;

        if (x <= 13) {
            fun = -x * x * x + 9;
        } else {
            fun = -3 / (x + 1);
        }
        System.out.println("Задача 36. Значение функции = [" + fun + "];");
    }

}
