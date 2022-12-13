public class Task2 {

    static boolean chipsParty(int crisps, boolean bool) {
        if (bool && crisps >= 15) {
            return true;
        } else {
            return !bool && crisps >= 15 && crisps <= 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(chipsParty(25, false));
    }
}

