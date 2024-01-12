package p1Z0_808_1;

/**
 * InnerQ15
 */
public class Q15 {
    

    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
        // line n1
        //acct.amount = 0;
        //acct.changeAmount(-acct.amount);
        acct.changeAmount(-acct.getAmount());
        System.out.println(acct.getAmount());
    }
    
}


