package HomeWork2.loops;


public class multiplicationTask1_4 {
    public static void main(String[] args) {
        int multiplierMin = 1; // Начало умножений
        int multiplierMax = 10; // Им заканчиваем
        int NumMin = 2; // min число
        int NumMax = 9; // max число
        int columnsMax = 4; // колонки в ряд

        // Символ умножения окруженный пробелами (multiplicationSign): " × "
        String mSign = " " + (char) 0x00D7 + " ";

        /*
         Рассчитваю сколько всего будет строк таблиц в зависимости того,
         сколько будет всего таблиц с числами (NumMax - NumMin + 1),
         в зависимости от columnsMax столбиков в одной такой строке.
         */
        int RowsMax = (NumMax - NumMin + 1) / columnsMax;
        if ((NumMax - NumMin + 1) % columnsMax > 0) {
            RowsMax++;
        }
        for (int row = 0; row < RowsMax; row++) {
            for (int j = multiplierMin; j <= multiplierMax; j++) {
                for (int i = NumMin + row * columnsMax;
                     (i < NumMin + row * columnsMax + columnsMax) && (i <= NumMax); i++) {
                    System.out.printf("%2d%s%2d%s%2d%2s", i, mSign, j, " = ", i * j, "");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
