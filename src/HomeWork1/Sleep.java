package HomeWork1;

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сейчас рабочий день? (true, false): ");
        Boolean wekday = in.nextBoolean();
        System.out.print("Сейчас отпуск? (true, false): ");
        Boolean vacation = in.nextBoolean();

        if (wekday == true & vacation == true){
            System.out.println("В отпуск не надо работать!");
        } else {
            if (sleepIn(wekday, vacation)) {
                System.out.println("Можно спать дальше!");
            }else{
                System.out.println("Нужно идти на работу!");
            }
        }

    }
    public static boolean sleepIn(boolean wekday, boolean vacation) {
        return (!wekday || vacation) ? true : false;
    }
}
