package HomeWork2.utils;

import java.util.Scanner;

public class ValueConsole {
    public static long check1(long inNumber) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            inNumber = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(inNumber * 2);
        } else {
            System.out.println("Вы ввели не целое число");
        }
        return inNumber;
    }
}


