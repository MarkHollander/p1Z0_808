package p1Z0_808_2;

public class Q81 {
    public static void main(String[] args) {
        try {
            int num = 10;
            int div = 0;
            int ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0; // ans cannot be resolved to a variable
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }
    }
}
