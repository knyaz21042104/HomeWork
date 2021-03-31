package HomeWork1;

public class priority {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 7, f = 20, h = 22, g = 68;
        int j = 6, k = 3, l = 12, m = 119;
        int result;
        //boolean result2 = true;
        //boolean result3 = true;
        result = a + b / c;
        System.out.println(result);
        result = (a + b) / c;
        System.out.println(result);
        result = (a + b++) / c;
        System.out.println(result);
        result = (a + b++) / --c;
        System.out.println(result);
        result = (a * b >> b++) / --c;
        System.out.println(result);
        result = (a + d > f ? g : h * b >> b++) / --c;
        System.out.println(result);
        boolean result2 = j - b > k && l * l <= m;
        System.out.println(result2);
        boolean result3 = true && false;
    }
}
