package ru.geekbrains;

///*
// * Задание №1
// * Создать пустой проект в IntelliJ IDEA и прописать метод main().
// */
//public class Homework1 {
//    public static void main (String [] args)
//    {
//    }
//}

// * Задание №2
// * Создать переменные всех пройденных типов данных и инициализировать их значения.
// */
//public class Homework1 {
//    public static void main (String [] args)
//    {
////        Целочисленные значения
//        int a = 1;
//        byte b = 2;
//        short c = 3;
//        long d = 4;
////        С плавающей точкой
//        float e = 2.8f;
//        double f = 2.8;
////        Символьные
//        char g = 'a';
////        Логический тип
//        boolean isTrue = true;
//        boolean isFalse = false;
//    }
//}
// * Задание №3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
// * где a, b, c, d – аргументы этого метода, имеющие тип float.
// */
//public class Homework1 {
//    public static void main (String [] args)
//    {
//// Объявляем 4 переменные с плавающей точкой типа float
//        float a = 1.8f;
//        float b = 2.0f;
//        float c = 4.01f;
//        float d = 5f;
//        float expressionResult = calculateExpression(a,b,c,d);
//// Выводим результат вычислений
//        System.out.println("Результат вычислений: " +expressionResult);
//    }
//    /*
//     * Метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
//     */
//    public static float calculateExpression (float a, float b, float c, float d)
//    {
//        return a * (b + (c / d));
//    }
//}

// *   Задание №4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
// */
//public class Homework1 {
//    public static void main (String [] args)
//    {
//        // Выводим результат
//        System.out.println(isSumBetween10And20(9,10));
//        System.out.println(isSumBetween10And20(11,10));
//        System.out.println(isSumBetween10And20(11,10));
//    }
//    public static boolean isSumBetween10And20 (int a, int b)
//    {
//        int sum = a + b;
//        boolean res = sum > 10 && sum <= 20;
//        return res;
//    }
//}

// * Задание 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
// */
//public class Homework1 {
//    public static void main (String [] args)
//    {
//        // Выводим результат
//        int number = 10;
//        printNegativeOrPositive (number);
//    }
//    public static void printNegativeOrPositive (int number)
//    {
//        int sum = a + b;
//        boolean res = sum > 10 && sum <= 20;
//        return res;
//        if (number >= 0)
//        {
//            System.out.println(number+ " положительное число");
//        }
//        else
//        {
//            System.out.println(number+ " отрицательное число");
//        }
//
//    }
//}

// * Задание 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// */
//public class Homework1 {
//    public static void main (String [] args)
//    {
//        // Выводим результат
//        int number = 10;
//    }
//    public static boolean isNegative (int number)
//    {
//        return number < 0;
//    }
//}

// * Задание 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
// * Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
// */
//public class Homework1 {
//    public static void main (String [] args)
//    {
//        // Выводим результат
//        String name = "Jack";
//        printName (name);
//    }
//    public static void printName (String name)
//    {
//        return number < 0;
//        System.out.println("Привет " + name + "!");
//    }
//}

/*
 * Задание 8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Homework1 {
    public static void main (String [] args)
    {
        int year = 2001;
        printIfYearIsLeapOrNot(year);
    }
    public static void printIfYearIsLeapOrNot (int year)
    {
        if (year % 4 == 0 && year % 100 != 0)
        {
            System.out.println(year + " год является високосным.");
        }
        else if (year % 400 == 0)
        {
            System.out.println(year + " год является високосным.");
        }
        else
        {
            System.out.println(year + " год является не високосным.");
        }
    }
}