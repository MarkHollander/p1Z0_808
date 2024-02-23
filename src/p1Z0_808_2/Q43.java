package p1Z0_808_2;
import p1Z0_808_1.Acc;

public class Q43 extends Acc{
    
    public static void main(String[] args) {
        Acc obj = new Q43();
        System.out.println(obj.p);
        // System.out.println(obj.q); // private
        System.out.println(obj.r);
        System.out.println(obj.s);
    }
    
    // What is the result?
    // A. 0 0 0 0
    // B. Compilation fails at the line // private
    // C. Compilation fails at the line // protected
    // D. Compilation fails at the line // public
    // E. Compilation fails at the line // int q;
    // F. Compilation fails at the line // int p;
    // G. Compilation fails at the line // Acc obj = new Acc();
    // H. Compilation fails at the line // import p1Z0_808_1.Acc;
    // Answer: A
    // Explanation:
    // Acc obj = new Acc();
    // System.out.println(obj.p); // 0
    // System.out.println(obj.q); // private
    // System.out.println(obj.r); // 0
    // System.out.println(obj.s); // 0
    // The code will compile and run without issue, so options B, C, D, E, F, G, and H are incorrect.
    // The code will output 0 0 0 0, so the correct answer is option A.
}
