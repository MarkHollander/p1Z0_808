package p1Z0_808_2;

import java.util.ArrayList;
import java.util.List;

public class Q139_2 {
    public static void main(String[] args) {
        List obj =  new ArrayList();
        Contract c1 = new Super();
        Contract c2 = new Sub();
        Super s1 = new Sub();
        obj.add(c1);
        obj.add(c2);
        obj.add(s1);
        for (Object item : obj) {
            System.out.println(item.getClass().getName());
        }
        
    }
}
