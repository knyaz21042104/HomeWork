package HomeWork1;

public class Sleep {
    public static void main(String[] args) {
        boolean wekday = true;
        boolean vacation = true;
        System.out.println(sleepIn(wekday, vacation));
    }
    public static boolean sleepIn(boolean wekday, boolean vacation) {
        return (!wekday || vacation) ? true : false;
    }
}
