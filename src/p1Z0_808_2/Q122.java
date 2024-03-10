package p1Z0_808_2;

public class Q122 extends C2 implements I{  
    public void displayI() {
        System.out.println("C1");
    }
    public static void main(String[] args) {
        I obj1 = new Q122();
        C2 obj2 = new Q122();
        I s = (I) obj2;
        s.displayI();
        obj2.displayC2();
    }
    
}
