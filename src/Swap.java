public class Swap {
    static int x;
    static int y;

    static void swap(int x, int y) {
        x = x * y;
        y = x / y;
        x = x / y;
        Swap.x = x;
        Swap.y = y;
    }
}
