package p1Z0_808_1;

public class Q38 {
    public static String MarkCC(String CreditCard) {
        String x = "xxxx-xxxx-xxxx-";
        // line n1
        StringBuilder sb = new StringBuilder(x);
        sb.append(CreditCard, 15, 19);
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(MarkCC("1234-5678-9101-1121"));
    }
}
