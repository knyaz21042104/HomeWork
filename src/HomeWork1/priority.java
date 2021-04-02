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
        //2/8 5+1/4=5(int)
        System.out.println(result);
        result = (a + b) / c;
        //5+2=7 7/8=0 int
        System.out.println(result);
        result = (a + b++) / c;
        System.out.println(result);
        //5+2=7 2+1=3 7/8=0(int)
        result = (a + b++) / --c;
        System.out.println(result);
        result = (a * b >> b++) / --c;
        //5*2=10 10>>2=2 2+1=3 8-1=8 2/7=0(int)
        System.out.println(result);
        result = (a + d > f ? g : h * b >> b++) / --c;
        /*
        5+7=13
        22*2=44
        2+1=3
        44>>2=11
        13<20 44>>2 11
        8-1=7
        11/7=1(остаток отрезается)
         */
        System.out.println(result);
        boolean result2 = j - b > k && l * l <= m;
        /*
        6-3=4
        12*12=144
        4>3 true
        144<=119 false
         */
        System.out.println(result2);
        boolean result3 = true && false;
        //false
    }
}
