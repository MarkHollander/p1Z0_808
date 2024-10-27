package p1Z0_808_2;

public class Q81 {
    public static void main(String[] args) {
        int ans;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0; // ans cannot be resolved to a variable
        } 
        // catch (Exception e) {
        //     System.out.println("Invalid calculation");
        // }
        System.out.println("Answer = " + ans);
    }
}
