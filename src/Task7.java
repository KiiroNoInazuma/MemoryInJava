import java.util.Arrays;
import java.util.Scanner;


public class Task7 {
    static int[] posArray;

    static int[] creatArray(int length) {
        posArray = new int[length];
        for (int i = 0; i < posArray.length; i++) {
            posArray[i] = (int) (Math.random() * 11 - 5);
        }
        return posArray;
    }

    static void result() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        if (length % 2 != 0) {
            System.out.println("Введите чётное число");
            result();
            return;
        }
        posArray = creatArray(length);
        int a = 0;
        int b = 0;
        for (int i = 0; i < length; i++) {
            if (i < length / 2) {
                a += Math.abs(posArray[i]);
            } else if (i >= length / 2) {
                b += Math.abs(posArray[i]);
            }
        }
        if (a > b) {
            System.out.println("Сумма модулей первой части массива больше, чем сумма модулей второй части.");
        } else if (a < b) {
            System.out.println("Сумма модулей первой части массива меньше, чем сумма модулей второй части.");
        } else {
            System.out.println("Сумма модулей первой и второй части равны.");
        }
        System.out.println(Arrays.toString(posArray));
    }

    public static void main(String[] args) {
        result();

    }
}
