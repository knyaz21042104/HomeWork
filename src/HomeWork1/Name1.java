package HomeWork1;

import java.util.Scanner;

public class Name1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        if (name.equals("Вася")){
            System.out.println("Привет");
            System.out.println("Я долго тебя ждал");
        }
        else if (name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
