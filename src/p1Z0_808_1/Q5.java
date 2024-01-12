package p1Z0_808_1;

import java.time.LocalDate;

public class Q5 {
    public static void main(String[] args) {
        String date = LocalDate
                .parse("2014-05-04")
                .format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date);
    }
}
