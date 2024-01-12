package p1Z0_808_1;
/**
 * Readable
 */
interface Readable {

    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable {
    public void readBook () {
        System.out.println("readBook1");
    };
    
    
}

abstract class EBook extends Book  {
    public void readBook () {
        System.out.println("readBook2");
    }
    
}

public class Q9 extends EBook{
    
    public void readBook () {
        System.out.println("readBook3");
    }

    public void setBookMark() {
        System.out.println("setBookMark3");
    }

    public static void main(String[] args) {
        Q9 q9 = new Q9();
        q9.readBook();
        int i =0;
        for (i = 0; i < 0; i++) {
            System.out.println(i);
        }
        System.out.println(i);
    }
}
