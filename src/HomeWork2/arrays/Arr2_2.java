package HomeWork2.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arr2_2 {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите набор целых чисел, через запятую ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(", ");

        int[] arr = new int [numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr [i] = Integer.parseInt(numbers[i]);
        }
        System.out.println("\nВывод значений массива через do-while: ");
        int i = 0;
        do {
            System.out.print(arr[i] + "  ");
            i++;
        } while (i < arr.length);
        System.out.println();
        System.out.println("\nВывод значений массива через while: ");
        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + "  ");
            i++;
        }
        System.out.println();
        System.out.println("\nВывод значений массива через for: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("\nВывод значений массива через foreach: ");
        for (int num: arr) {
            System.out.print(num + "  ");
        }
        System.out.println();
    }
}
