public class Task4 {

    static int twoNum(int a, int b) {
        for (int i = 13; i <= 19; i++) {
            if (a == i||b==i) return 19;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(twoNum(13, 2));
    }
}
