package p1Z0_808_1;

public class Q17 {
    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Q17 ex = new Q17();
        int cardNo = 12344;
        ex.checkCard(cardNo); // line n1
        //ex.readCard(cardNo); // line n2
    }
}
