package p1Z0_808_2;

public class Q82 {
    
        int x;
        int y;
        public void doStuff(int x, int y) {
            this.x = x;
            y = this.y;
        }

        public void display() {
            System.out.print(x + " " + y + " : ");
        }

        public static void main(String[] args) {
            Q82 f1 = new Q82();
            f1.x = 100;
            f1.y = 200;
            Q82 f2 = new Q82();
            f2.doStuff(f1.x, f1.y);
            f1.display();
            f2.display();
        }
        
    
}
