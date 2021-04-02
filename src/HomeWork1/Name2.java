package HomeWork1;

import java.util.Scanner;

public class Name2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        result(name);
    }

    public static void result(String name) {

        switch (name) {
            case "Вася": {
                System.out.println("Привет");
                System.out.println("Я долго тебя ждал");
                break;
            }

            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}