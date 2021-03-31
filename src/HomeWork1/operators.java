package HomeWork1;

public class operators {
    public static void main(String[] args) {
        int a = 42;
        System.out.println("a в двоичной системе = " + Integer.toBinaryString(a)); //101010
        int b = 15;
        System.out.println("b в двоичной системе = " + Integer.toBinaryString(b)); //1111
        int c = a & b;
        System.out.println("оператор a & b = " + c);
        /*
        101010 & (и)
          1111 =
        001010
         */
        int d = a | b;
        System.out.println("оператор a | b = " + d);
        /*
        101010 | (или)
          1111 =
        101111
         */
        int e = a ^ b;
        System.out.println("оператор a ^ b = " + e);
        /*
        101010 ^ (исключающее или)
          1111 =
        100101
         */
        System.out.println("~a = " + ~a); //инвертнули a
        System.out.println("~b = " + ~b); //инвернули b
        int f = (a << b); // сдвигаем на 15 битов влево
        System.out.println(" a << b сдвинули a на 15 битов влево = " + Integer.toBinaryString(f));
        // 101010 = 101010 + 15 нулей
        a <<= b; // сдвигаем на 15 битов влево с присвоением
        System.out.println(" a <<= b сдвинули a на 15 битов влево с присовением = " + Integer.toBinaryString(a));
        // 101010 = 101010 + 15 нулей
        int g = (a >> b); // сдвигаем на 15 битов влево
        System.out.println(" a >> b сдвинули a на 15 битов вправо = " + Integer.toBinaryString(g));
        // 101010 = 101010 + 15 нулей слева. Сумоист выталкнул бойца за предел))))
        a >>= b; // сдвигаем на 15 битов влево c присвоением
        System.out.println(" a >>= b сдвинули a на 15 битов вправо с присовением = "  + b);
        // 101010 = 101010 + 15 нулей слева. Сумоист выталкнул бойца за предел))))
        int j = (a >>> b); // сдвигаем на 15 битов влево
        System.out.println(" a >>> b сдвинули a на 15 битов вправо = " + Integer.toBinaryString(j));
        // 101010 = 101010 + 15 нулей слева. Сумоист выталкнул бойца за предел))))
        a >>>= b; // сдвигаем на 15 битов влево
        System.out.println(" a >>>= b сдвинули a на 15 битов вправо без учета = " + Integer.toBinaryString(b));
        // 00000000_00000000_00000000_00001111 тут можем смещать намного)

        int x = -42;
        System.out.println("a в двоичной системе = " + Integer.toBinaryString(x)); //11111111111111111111111111010110
        int z = -15;
        System.out.println("b в двоичной системе = " + Integer.toBinaryString(z)); //11111111111111111111111111110001
        int n = x & z;
        System.out.println("оператор a & b = " + n);
        /*
        11111111111111111111111111010110 & (и)
        11111111111111111111111111110001 =
        001010
         */
        int m = x | z;
        System.out.println("оператор a | b = " + d);
        /*
        11111111111111111111111111010110 | (или)
        11111111111111111111111111110001 =
        101111
         */
        int o = x ^ z;
        System.out.println("оператор a ^ b = " + e);
        /*
        11111111111111111111111111010110 ^ (исключающее или)
        11111111111111111111111111110001 =
        100101
         */
        System.out.println("~x = " + ~x); //инвертнули a
        System.out.println("~z = " + ~z); //инвернули b
        int p = (x << z); // сдвигаем на 15 битов влево
        System.out.println(" x << z сдвинули a на 15 битов влево = " + Integer.toBinaryString(p));
        // 11111111111111111111111111010110 = 11111111111111111111111111010110 + 15 едениц
        x <<= z; // сдвигаем на 15 битов влево с присвоением
        System.out.println(" x <<= z сдвинули a на 15 битов влево с присовением = " + Integer.toBinaryString(x));
        // 11111111111111111111111111010110 = 11111111111111111111111111010110 + 15 едениц
        int r = (x >> z); // сдвигаем на 15 битов влево
        System.out.println(" a >> b сдвинули a на 15 битов вправо = " + Integer.toBinaryString(r));
        // 11111111111111111111111111010110 = 11111111111111111111111111010110 + 15 едениц слева. Сумоист выталкнул бойца за предел))))
        x >>= z; // сдвигаем на 15 битов влево c присвоением
        System.out.println(" x >>= z сдвинули a на 15 битов вправо с присовением = "  + x);
        // 11111111111111111111111111010110 = 11111111111111111111111111010110 + 15 нулей слева. Сумоист выталкнул бойца за предел))))
        int s = (x >>> z); // сдвигаем на 15 битов влево
        System.out.println(" x >>> z сдвинули a на 15 битов вправо = " + Integer.toBinaryString(s));
        // 11111111111111111111111111010110 = 11111111111111111111111111010110 + 15 нулей справа. Сумоист выталкнул бойца за предел))))
        x >>>= z; // сдвигаем на 15 битов влево
        System.out.println(" x >>>= z сдвинули a на 15 битов вправо без учета = " + Integer.toBinaryString(x));
        // 11111111111111111111111111010110 тут можем смещать намного)
    }   // 000000000000000111111111111111
}
