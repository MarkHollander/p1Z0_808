package p1Z0_808_2;

public class Q134 {
    int a1;
    public static void doProduct(int a) {
        a = a * a;
    }

    public static void doString(StringBuilder sb) {
        sb.append(" " + sb);
    }

    public static void main(String[] args) {
        Q134 item = new Q134();
        item.a1 = 11;
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);
    }
}
