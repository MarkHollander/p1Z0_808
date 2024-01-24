package p1Z0_808_1;

public class Q51 extends Vehicle{
    int y;

    Q51() {
        super();
        this(20)

    }

    Q51(int y) {
        
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Q51(20);
        System.out.println(y);
    }
    
}
