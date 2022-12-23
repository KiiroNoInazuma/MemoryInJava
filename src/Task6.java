public class Task6 {

    static boolean twoTwo(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == 2) {
                if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                    return false;
                } else if ((arr[0] == 2 && arr[0] != arr[1]) || (arr[arr.length - 1] == 2 && arr[arr.length - 1] != arr[arr.length - 2])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 2};
        System.out.println(twoTwo(arr));

    }
}
