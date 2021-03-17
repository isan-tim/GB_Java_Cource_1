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
public class Homework1 {
    public static void main (String [] args)
    {
// Объявляем 4 переменные с плавающей точкой типа float
        float a = 1.8f;
        float b = 2.0f;
        float c = 4.01f;
        float d = 5f;
        float expressionResult = calculateExpression(a,b,c,d);
// Выводим результат вычислений
        System.out.println("Результат вычислений: " +expressionResult);
    }
    /*
     * Метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
     */
    public static float calculateExpression (float a, float b, float c, float d)
    {
        return a * (b + (c / d));
    }
}