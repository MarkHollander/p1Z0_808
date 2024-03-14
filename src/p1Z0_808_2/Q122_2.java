package p1Z0_808_2;

import java.util.ArrayList;
import java.util.List;

public class Q122_2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello Java!");
        String s2 = s1.toString();
        List<String> lst = new ArrayList<String>();
        lst.add(s2);
        System.out.println(s1.getClass()    + " " + s2.getClass() + " " + lst.getClass());


    }
}
