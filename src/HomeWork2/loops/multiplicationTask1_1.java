package HomeWork2.loops;

import java.util.Scanner;

public class multiplicationTask1_1 {
    public static void main(String[] args) {
        System.out.print("Введите целое число :");
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        long result = 1;

        for (int i = 1; i <= number; ++i){
            if (i != number){
                System.out.print(i + " * ");
            }else {
                System.out.print(result + " = ");
            }
            result = number * i;
        }
        System.out.println(result);
    }
}
