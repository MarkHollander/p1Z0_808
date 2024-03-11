package p1Z0_808_2;

public class Q114 {
    public static void main(String[] args) {
        int data[] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int e : data) {
            if (e != key) {
                continue;
                count++; // Unreachable code
            }
            //count++;
            System.out.println(count + " Found ");
        }
    }
}
