package HomeWork2.loops;

import java.util.Scanner;

public class multiplicationTask1_2 {
    public static void main(String[] args) {
        System.out.print("Введите целое число :");
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();

        System.out.println(recursionNum(number) + "=" + recursionResult(number));
    }
    //функция получает параметр int и возвращает до =
    public static String recursionNum(long n){
        if (n==1){
            return "1";
        }
        return recursionNum(n-1) + " * " +n;
    }
    //функция получает параметр int и возвращает после =
    public static long recursionResult(long n){
        if (n==1){
            return n;
        }
        return n * recursionResult(n-1);
    }
}
