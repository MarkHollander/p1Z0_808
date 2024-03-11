package p1Z0_808_2;

public class Q121 {
    public static int stVar = 100;
    public int var = 200;
    public String toString() {
        return var + " : " + stVar;
    }
    public static void main(String[] args) {
        Q121 t1 = new Q121();
        t1.var = 300;
        System.out.println(t1);
        Q121 t2 = new Q121();
        t2.stVar = 300;
        System.out.println(t2);
    }
}
