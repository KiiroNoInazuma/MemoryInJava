public class Task3 {
    static boolean six(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (Math.abs(a - b) == 6 || a + b == 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(six(4, 10));
    }
}
