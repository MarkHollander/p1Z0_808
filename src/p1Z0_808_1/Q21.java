package p1Z0_808_1;

public class Q21 {
    public static void main(String[] args) {
        int x =  100;
        int a = x++;
        int b = ++x;
        int c = x++;
        //int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : 0;
        System.out.println(d);
    }
}
