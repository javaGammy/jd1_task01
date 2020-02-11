package by.mf.lin.solutions;

public class Compilation {
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
		//Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное
		double x;
		double y;
		
		x = 2.5;
		y = 5.0;
		
		System.out.println("Задача 1. Сумма = [" + (x + y) + "] " + " Разность = [" + (x - y) + "] " +" Произведение = [" +  x * y + "] " + " Частное = [" + x / y + "]; " );
	}
	public static void task02() {
		//Найдите значение функции: с = 3 + а
		int a;
		a = 3;
		
		System.out.println("Задача 2. Значение функции = [" + (3 + a) + "];");
	}
	public static void task03() {
		//Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.
		int x;
		int y;
		
		x = 1;
		y = 2;
		
		System.out.println("Задача 3. Значение функции = [" + (2 * x + (y - 2)) * 5 + "];");
	}
	public static void task04() {
		//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
		double a;		
		double b;
		double c;
		
		a = 10;
		b = 5;
		c = 2.5;
		
		System.out.println("Задача 4. Значение функции = [" + ((a - 3) * (b / 2) + c) + "];");
	}
	public static void task05() {
		//Составить алгоритм нахождения среднего арифметического двух чисел
		int a; 
		int b;
		
		a = 5;
		b = 10;
		
		System.out.println("Зaдача 5. Среднее арифметическое двух чисел = [" + (double)(a + b)/2 + "];");
	}
	public static void task06() {
		//Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?

		double n;
		double m;
		
		n = 4;
		m = 6;
		
		System.out.println("Задача 6. Литров молока в больших бидонах = [" + (((80 / n) + 12) * m) + "];" );
	}
	public static void task07() {
		//Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
		double x;
		double y;
		
		x = 5.0;
		y = x / 2.0;
		
		System.out.println("Задача 7. Площадь прямоугольника = [" + x * y + "];");
	}
	public static void task08() {
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		double a;
		double b;			
		double c;
		
		a = 1.0;
		b = 1.0;
		c = 1.0;
		
		System.out.println("Задача 8. Значение выражения = [" + (((b + (Math.sqrt((b * b + 4 * a * c)))) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2)) + "];");
	}
	public static void task09() {
		// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		double a;
		double b;
		double c;
		double d;
		
		a = 1.0;
		b = 2.0;
		c = 3.0;
		d = 4.0;
		
		System.out.println("Задача 9. Значение выражения = [" + ((a / c) * (b / d) - (a * b - c) / (c * d)) + "];");	
	}
	public static void task10() {
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		double x;
		double y;
		
		x = 1.0;
		y = 2.0;
		
		System.out.println("Задача 10. Значение выражения = [" + (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y) + "];");
	}
	public static void task11() {
		//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
		double a;
		double b;
		double c;
		
		a = 3.0;
		b = 4.0;
		c = Math.sqrt(a * a + b * b);
		System.out.println("Задача 11. Периметр треугольника = ["  + (a + b + c) + "] Площадь треугольника = ["  + ((a * b) / 2) + "];");
	}
	public static void task12() {
		//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
		double x1;
		double x2;
		
		double y1;
		double y2;
		
		x1 = 2.0;
		x2 = 4.0;
		
		y1 = 3.0;
		y2 = 4.0;
		
		System.out.println("Задача 12. Расстояние между точками = [" + Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2)) + "];");
	}
	public static void task13() {
		//Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double x3;
		double y3;

		x1 = 3.0;
		y1 = -3.0;
		
		x2 = 7.0;
		y2 = -3.0;
		
		x3 = 5;
		y3 = 5;
		
		
		
		System.out.println("Задача 13. Периметр треугольника = [" + (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow(y3 - y1, 2)) + Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow(y3 - y2, 2))) + "] Площадь треугольника = [" + (0.5 * ((x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3))) + "];");
	}
	public static void task14() {
		//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
		double R;
		R = 0.5;
		
		System.out.println("Задача 14. Длина окружности = [" + (2 * 3.14 * R) + "] Площадь круга = [" + (3.14 * R * R) + "];");
	}
	public static void task15() {
		//Написать программу, которая выводит на экран первые четыре степени числа π.
		System.out.println("Задача 15. Первая степень = [" + Math.pow(3.14, 1) + "] Вторая степень = [" + Math.pow(3.14, 2) + "] Третья степень = [" + Math.pow(3.14, 3) + "] Четвертая степень = [" + Math.pow(3.14, 4) + "];");
	}
	public static void task16() {
		//Найти произведение цифр заданного четырехзначного числа
		int num;
		int comp;
		
		num = 3215;
		comp = 1;
		
		for( int i = 0; i < 4; i++) {
			comp *= num % 10;
			num /= 10;
		}
		System.out.println("Задача 16. Произведение цифр = [" + comp + "]");
	}
	public static void task17() {
		//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
		double a;
		double b;
		
		a = -2.2323;
		b = -6.2323;
		
		System.out.println("Задача 17. Среднее арифметическое кубов = [" + ((Math.pow(a, 3) + Math.pow(b, 3)) / 2) + "] Среднее геометрическое модулей = [" + Math.sqrt(Math.abs(a) * Math.abs(b)) + "];");
		
	}
	public static void task18() {
		//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
		double a;
		
		a = 2;
		
		System.out.println("Задача 18. Площадь грани = [" + Math.pow(a, 2) + "] Площадь полной поверхности = [" + (6 * Math.pow(a, 2)) + "] Объем куба = [" + Math.pow(a, 3)+ "];");
	}
	public static void task19() {
		//Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

		double a;
		
		a = 3;
		
		System.out.println("Задача 19. Площадь треугольника = [" + (Math.sqrt(3) / 4) * Math.pow(a, 2) + "] Высота треугольника = [" + ((Math.sqrt(3) / 2) * a) + "] Радиус вписанной и описанной окружности = [" + (a / (2 * Math.sqrt(3))) + "] и [" + (a / Math.sqrt(3)) + "];");
	}
	public static void task20() {
		//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью
		double a;
		
		a = 2;
		
		System.out.println("Задача 20. Площадь круга = [" + Math.pow(a, 2) / (4 * Math.PI) + "];");
	}
	public static void task21() {
		//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.

		double num;
		double conv;
		
		
		num = 123.456;
		conv = ((int)num / 1000.0 + (num - (int)num) * 1000);
		System.out.println("Задача 21. Число наоборот = [" + conv + "];");
    }
    public static void task22() {
		// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    	// Вывести данное значение длительности в часах, минутах и секундах в следующей
    	// форме: ННч ММмин SSc.
    	int t = 2123123;	
		
		int hour;
		int min;
		int sec;
		
		hour = t / 3600;
		min = t % 3600 / 60;
		sec = t % 3600 / 60;
		
		if (hour / 10 == 0) {
			System.out.print("0" + hour + "ч");
		} else {
			System.out.print(hour + "ч");
		}
		
		if (min / 10 == 0) {
			System.out.print("0" + min + "мин");
		} else {
			System.out.print(min + "мин");
		}
		
		if (sec / 10 == 0) {
			System.out.print("0" + sec + "сек");
		} else {
			System.out.print(sec + "сек");
		}
		
		
		
		
	}
	public static void task23() {
		//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)
		double r1;
		double r2;
		
		r1 = 2;
		r2 = 4;
		if (r2 > r1) {
		System.out.println("Задача 23. Площадь кольца = " + Math.PI * (Math.pow(r2, 2) - Math.pow(r1, 2)));
		} else {
			System.out.println("Задача 25. r2 должно быть больше r1");
		}
		
	}
	public static void task24() {
		//Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
		double a;
		double b;
		double l;
		
		a = 5;
		b = 2;
		l = 45;
		
		System.out.println("Задача 24. Площадь равнобедренной трапеции = [" + (0.5 * (a - b) * (Math.tan(Math.toRadians(l)))) + "];");
		
	}
	public static void task25() {
		//Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
		double a;
		double b;
		
		double c;
		double d;
		
		a = 3;
		b = 4;
		
		c = 1;
		d = Math.pow(b, 2) - 4 * a * c;
		
		if (d >= 0) {
			System.out.println("Задача 25. Первый корень = [" + ((-b + Math.sqrt(d)) / (2 * a)) + "] Второй корень = [" + ((-b - Math.sqrt(d)) / (2 * a)) + "];");
		} else if(d == 0) {
			System.out.println("Задача 25. Корень уравнения = ["  + ((-b / (2 * a))) + "];");
		} else {
			System.out.println("Задача 25. Дискриминант уравнения отрицателен");
		}
		
	}
	public static void task26() {
		//Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
		double a;
		double b;
		double y;
		
		a = 5;
		b = 3;
		y = 30.0;
		
		System.out.println("Задача 26. Площадь треугольника = [" + (0.5 * a * b * (Math.sin(Math.toRadians(y)))) + "];");
		
	}
    public static void task27() {
    	//Составить программу перевода радианной меры угла в градусы, минуты и секунды
    	int a;
    	int b;
    	int c;
    	
    	a = 2;
    	
    	b = a * a;
    	b = b * b;
    	b = b * b;
    	c = a * a;
    	System.out.println("Задача 27. Число в 8 степени = [" + b + "] Число в 10 степени = [" + (b * c) + "]");
    }
    public static void task28() {
    	//Составить программу перевода радианной меры угла в градусы, минуты и секунды
    	double rad;
    	double min;
    	
    	rad = 0.5;
    	min = 30;
    	
    	System.out.println("Задача 28. В градусах = [" + ((rad * 180) / Math.PI) + "] В секундах = [" + (min * 3600) + "]; ");
    	
    }
    public static void task29() {
    	 //Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
    	double a;
    	double b; 
    	double c;
    	double firstCorner;
    	double secondCorner;
    	double thirtCorner;
    	
    	a = 4;
    	b = 3;
    	c = 5;
    	
    	firstCorner = Math.toDegrees(Math.acos(((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c))));
    	secondCorner = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
    	thirtCorner = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));
    	
    	System.out.println("Задача 29. Первый угол в градусах = [" + firstCorner + "] в радианах [" + Math.toRadians(firstCorner) + "]; Второй угол в градусах [" + secondCorner + "] в радианах [" + Math.toRadians(secondCorner) + "]; Третий угол в градусах [" + thirtCorner + "] в радианах [" + Math.toRadians(thirtCorner) + "];");
    }
    public static void task30() {
    	// Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
    	double r1;
    	double r2;
    	double r3;
    	
    	r1 = 3;
    	r2 = 4;
    	r3 = 5;
    	
    	System.out.println("Задача 30. Сопротивление соединения = [" + (r1 * r2 * r3) / (r1 * r2 + r1 * r3 + r2 * r3) + "];");
    }
    public static void task31() {
    	//Cоставить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
    	double v;
    	double v1;
    	double t1;
    	double t2;
    	
    	v = 4;
    	v1 = 3;
    	t1 = 5;
    	t2 = 7;
    	
    	
    	  	
    	System.out.println("Задача 31. Путь, пройденный лодкой = [" + (((v + v1) * t1) + ((v - v1) * t2)) + "];");
    	
    	
    }
    public static void task32() {
    	//Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
    	double hour = 11;
		double min1 = 23;
		double sec = 44;
		double p = 2;
		double q = 14;
		double r = 34;
		
		double min2;

		double rezCh;
		double rezMin;
		double rezSec;

		rezSec = (sec + r) % 60;
		min2 = (min1 + q + (sec + r) / 60);
		rezMin = min2 % 60;
		rezCh = (hour + p + min2 / 60) % 24;

		System.out.println("Задача 32. Показатели часов = [" + rezCh + " ч] [" + rezMin + " мин] [" + rezSec + " сек]");
    }
    public static void task33() {
    	//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
    	char ch;
    	
    	ch = ')';
    	
    	System.out.println("Задача 33. Порядковый номер = [" + (int)ch + "] Предедущий = [" + (ch--) + "] Последующий = [" + ch++ + "];");
    }
    public static void task34() {
    	//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
 
    	double a = 1000000000;     	 
    	 
         System.out.println("Задача 34. В битах =[" + (a * 8) + "] В Кбайтах = [" + (a / 1024) + "] В Мбайтах = [" + (a / Math.pow(1024, 2) + "] В Гбайтах = [" + (a / Math.pow(1024, 3) + "] В Тбайтах = [" + (a / Math.pow(1024, 4))))); 

    }
    public static void task35() {
    	//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
    	int m = 11; 
        int n = 3; 
        
        double x = (double)m / n; 
        double z = x - (int)x; 
 
 
        System.out.println("Задача 35. Младшая цифра целой = [" + ((int)x % 10) + "] Старшая цифра дробной части = ["  + (int)(z * 10) + "];"); 

    }
    public static void task36() {
    	//Найти частное произведений четных и нечетных цифр четырехзначного числа.
    	int num = 3344; 
        int comp1 = 1; 
        int comp2 = 1; 
 
        for (int i = 0; i < 4; i++){ 
            if (num % 2 == 0) { 
                comp1 *= num % 10; 
            } else { 
                comp2 *= num % 10; 
            } 
            num /= 10; 
        } 
        System.out.println("Задача 36. Частное произведение = [" + (comp1 / comp2) + "];"); 

    }
    public static void task37() {
    	//Целое число N является четным двузначным числом.
    	double n = 2134;
    	
    	if ((n % 2 == 0) & (n / 10 > 1)) {
			System.out.println("True;");
		} else {
			System.out.println("False");
		}
    	
    	//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
    	double x;
		double y;
		
		double z;
		double q;
		
		x = n / 1000;
		y = (n / 100) % 10;
		z = (n / 10) % 10;
		q = n % 10;

		if (x + y == z + q) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		//Сумма цифр данного трехзначного числа N является четным числом.
		double sum = 0;
		
		for (int i = 0; i < 4; i++) {
			sum += n % 10;
			n /= 10;
		}
		if(sum % 2 == 0) {
			System.out.println("True");			
		} else {
			System.out.println("false");
		}
		//Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
		double x1 = 3;	
		
		double m = 4;
		double n1 = 5;
		
		if ((x1 > m) && (x1 < n1)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		//Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		double sum2 = 0;
		
		for (int i = 0; i < 4; i++) {
			sum2 += n % 10;
			n /= 10;
		}
		if (Math.pow(n, 2) == Math.pow(sum2, 3)) {
			System.out.println("True");
		} else {
			System.out.println("False"); 
		}
		//Треугольник со сторонами а,b,с является равнобедренным.
		int a = 5;
		int b = 4;
		int c = 6;
		
		if ((a == b) || (b == c) || (a == c)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		//Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
		double sum3 = 0;
		
		for (int i = 0; i < 4; i++) {
			sum3 += n % 10;
			n /= 10;			
		}
		
		if(sum3 == n % 10) {
			System.out.println("True");			
		} else {
			System.out.println("false");
		}
		//Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
		double a1 = 5;
		
		if ((Math.pow(a1, 0) == n) || (Math.pow(a1, 1) == n) || (Math.pow(a1, 2) == n) || (Math.pow(a1, 3) == n)
				|| (Math.pow(a1, 4) == n)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		//График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
		double a2;
		double b2;
		double c2;
		
		double m2 = 3;
		double n2 = 4;

		a2 = 14;
		b2 = 12;
		c2 = 3;

		if (n2 == a2 * Math.pow(m2, 2) + b2 * m2 + c2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}		
			
    }
    public static void task38() {
    	//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:	
    	
    	double x;
		double y;

		x = 1;
		y = 5;		

		if ((y >= 0) && (y <= x + 4) && (y <= 4 - x)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		

		if (y >= 0 & y <= 4 & x <= 2 & x >= -2 || (y >= -3) & (y <= 0) & x <= 4 & x >= -4) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		

		if (((x * x + y * y) <= 16) && x >= 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
    	
    }
    public static void task39() {
    	//Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций:2x^4- 3x^3 + 4х^2- 5х + 6.
    	double x = 3;
		

		double rez = 4;

		rez = (((2 * x - 3) * x + 4) * x - 5) * x + 6;

		System.out.println("Задача 39. Ответ = [" + rez + "];");
    }
    public static void task40() {
    	//Дано значение х. Получить значения -2х + 3х^2- 4х^3 и 1 + 2х + 3х^2 + * 4х^3. Позаботьтесь об экономии операций
    	double x;
		
    	double rez1;
		double rez2;

		x = 5;

		rez1 = ((-4 * x + 3) * x - 2) * x;

		rez2 = ((4 * x + 3) * x + 2) * x + 1;

		System.out.println("Задача 40. Ответ = [" + rez1 + "];" + " [" + rez2 + "];");

    }

}
