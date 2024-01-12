package p1Z0_808_1;

import java.time.LocalDate;

public class Q33 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", java.time.format.DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
    }
    
}
