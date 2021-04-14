package HomeWork2.loops;

import HomeWork2.utils.ValueConsole;

import java.util.Scanner;

public class multiplicationTask1_2 {
    public static void main(String[] args) {
        System.out.print("Введите целое число :");
        Scanner in = new Scanner(System.in);

        long number = in.nextLong();
        if(in.hasNextLong()){
            number = in.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }

        System.out.println(recursionNum(number) + "=" + recursionResult(number));
    }
    //функция получает параметр long и возвращает до =
    public static String recursionNum(long n){
        if (n==1){
            return "1";
        }
        return recursionNum(n-1) + " * " +n;
    }
    //функция получает параметр long и возвращает после =
    public static long recursionResult(long n){
        if (n==1){
            return n;
        }
        return n * recursionResult(n-1);
    }
}
