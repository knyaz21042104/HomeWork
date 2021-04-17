package HomeWork1;

public class PhoneNumber {
    public static void main(String[] args) {

        int numbers[];
        numbers = new int [10];
        for (int i = 0; i <10; i++){
            int a = (int) ( Math.random() * 10 );
            numbers[i] = a;
        }
        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber (int [] num) {
        StringBuilder build = new StringBuilder();
        for (int i : num) {
            build.append(i);
        }
        String strokaSimple = build.toString();

        String stroka1 = strokaSimple.substring(0,3);
        String stroka2 = strokaSimple.substring(3,6);
        String stroka3 = strokaSimple.substring(6);
        String phoneNumber = "(" + stroka1  + ") " + stroka2 + "-" + stroka3;

        return phoneNumber;
    }
}
