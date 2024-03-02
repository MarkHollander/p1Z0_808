package p1Z0_808_2;

public class Q73 {
    String myStr = "7007";
    public void doStuff(String str) {
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }

    public static void main(String[] args) {
        Q73 obj = new Q73();
        obj.doStuff("9009");
    }
}
