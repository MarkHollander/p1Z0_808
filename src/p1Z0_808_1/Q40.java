package p1Z0_808_1;

public class Q40 extends DerivedA {
    public void test() {
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1 = new Q40();
        Base b2 = new DerivedA();
        Base b3 = new Q40();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();


        // Q40 t1 = new Q40();
        // Q40 t2 = new Q40();
        // if (!t1.equals(t2)) {
        //     System.out.println("They are not equal");
        // } ;
        // if (t1 instanceof Object) {
        //     System.out.println("t1 is Object");
        // } ;
    }
    
}
