package p1Z0_808_1;

public class Q23 {
    String name;
    boolean contract;
    double salary;
    Q23() {
        // line n1
        //this.name = new String("Joe");
        //this.contract = new Boolean(true);
        //this.salary = new Double(100);
        //this("Joe", true, 100);
        this.name = "Joe";
        this.contract = true;
        this.salary = 100.0;
    }
    public String toString() {
        return name + ":" + contract + ":" + salary;
    }
    public static void main(String[] args) {
        Q23 e = new Q23();
        // line n2
        //System.out.println(e);
    }
}
