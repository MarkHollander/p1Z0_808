package p1Z0_808_1;

public class Q46 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        // line n1
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
