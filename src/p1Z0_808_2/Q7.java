package p1Z0_808_2;

class Q7 extends Vehicle{
    String trans;
    Q7(String trans) {
        this.trans = trans;
    }

    Q7(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this(trans);
    }

    public static void main(String[] args) {
        Q7 c1 = new Q7("Auto");
        Q7 c2 = new Q7("4W", 150, "Manual");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}
