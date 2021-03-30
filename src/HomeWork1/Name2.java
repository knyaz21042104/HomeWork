package HomeWork1;

import java.util.Scanner;

public class Name2 {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    String name1 = "Вася";
switch(name){

        case "Вася":
            System.out.println("число равно 1");
            break;
        case "Анастасия":
            System.out.println("число равно 8");
            break;
        default:
            System.out.println("число не равно 1, 8, 9");
    }
}
