package p1Z0_808_2;

public class Q131_2 {
    public static void main(String[] args) {
        try {
            String[] arr = new String[4];
            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";
            for (String var : arr) {
                System.out.print(var + " ");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getClass());
        }
    }
}
