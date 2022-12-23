public class Task5 {
    static int[] arr;

    static boolean has77(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == 7) {
                return true;
            }
        }
        for (int x = 0; x < arr.length - 2; x++) {
            if (arr[x] == arr[x + 2] && arr[x] == 7) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        arr = new int[]{7, 7, 7, 1, 7};
        System.out.println(has77(arr));
    }
}
