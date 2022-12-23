public class Task8 {

    static void dividers(int x) {
        System.out.print("Делители числа " + x + " ---> ");
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                if (i != x) {
                    System.out.print(i + ",");
                } else {
                    System.out.print(i + ".");
                }
            }
        }
    }

    public static void main(String[] args) {
        dividers(10);
    }
}
