package p1Z0_808_2;

public class Q140_2 {
    public static void main(String[] args) {
        Q140_2 ts = new Q140_2();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}
