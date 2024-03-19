package p1Z0_808_2;

public class Q138_2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (SpecialException e) {
            System.out.println(e);
            
        }       
    }

    static void doSomething() throws SpecialException {
        int[] ages = new int[4];
        ages[3] = 17;
        doSomething();
    }

    static void doSomethingElse() throws SpecialException {
        throw new SpecialException("Thrown at end of doSomething method");
    }
}
