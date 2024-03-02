package p1Z0_808_2;

public class Q75 {
    int[] nums1 = new int[3];
    int[] nums2 = {1, 2, 3, 4, 5};
    public void doStuff() {
        nums1 = nums2;
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Q75 test = new Q75();
        test.doStuff();
    }
}
