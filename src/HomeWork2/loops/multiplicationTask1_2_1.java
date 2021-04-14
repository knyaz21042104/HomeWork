package HomeWork2.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiplicationTask1_2_1 {
    public static void main(String[] args) throws IOException {
        String lineOfNumbers;
        do{
            System.out.println("Введите набор цифр. ");
            System.out.print("(вводить только целые числа: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            lineOfNumbers = br.readLine();
        } while(!isValidNumbers(lineOfNumbers));

        // Переменная для перевода из char в int
        int num = Integer.parseInt("" + lineOfNumbers.charAt(0));
        System.out.print("\n" + num);

        // Если было введено более 1 цифры
        if(lineOfNumbers.length() > 1) {
            long multiplication = num;

            // В цикле умножаем цифру и сразу печатаем ее в консоль
            for (int i = 1; i < lineOfNumbers.length(); i++) {
                num = Integer.parseInt("" + lineOfNumbers.charAt(i));
                multiplication *= num;
                System.out.print(" * " + num);
            }
            System.out.println(" = " + multiplication);
        } else { // если была введена всего одна цифра
            System.out.println(" = " + num);
        }
    }

    /*
     Метод проверяет является ли строка положительным целым числом.
     str — строка которую проверяем
     return true если все числа целые2
     */
    public static boolean isValidNumbers(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))||(Integer.parseInt("" + str.charAt(i)) == 0)) {
                return false;
            }
        }

        return true;
    }
}